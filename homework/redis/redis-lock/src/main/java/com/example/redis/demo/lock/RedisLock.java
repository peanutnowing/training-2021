package com.example.redis.demo.lock;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Collections;

/**
 * Redis简单分布式锁
 *
 * @author peanutnowing
 */
public class RedisLock {

    private enum EnumSingleton {
        /**
         * 懒汉枚举单例
         */
        INSTANCE;

        private RedisLock instance;

        EnumSingleton(){
            instance = new RedisLock();
        }
        public RedisLock getSingleton(){
            return instance;
        }
    }

    public static RedisLock getInstance(){
        return EnumSingleton.INSTANCE.getSingleton();
    }

    private JedisPool jedisPool = new JedisPool();

    /**
     * 加锁
     * @param lockValue
     * @param seconds 失效时间
     * @return get lock
     */
    public boolean lock(String lockValue, int seconds) {
        try(Jedis jedis = jedisPool.getResource()) {
            return "OK".equals(jedis.set(lockValue, lockValue, "NX", "EX", seconds));
        }
    }

    /**
     * 释放锁:使用lua脚本进行解锁
     * @param lock
     * @return release lock
     */
    public boolean release(String lock) {
        String luaScript = "if redis.call('get',KEYS[1]) == ARGV[1] then " + "return redis.call('del',KEYS[1]) else return 0 end";
        try(Jedis jedis = jedisPool.getResource()) {
            return jedis.eval(luaScript, Collections.singletonList(lock), Collections.singletonList(lock)).equals(1L);
        }
    }
}
