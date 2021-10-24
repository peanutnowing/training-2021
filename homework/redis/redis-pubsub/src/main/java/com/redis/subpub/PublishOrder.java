package com.redis.subpub;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Random;

/**
 * 基于Redis的PubSub，实现订单异步处理
 * 发布订单类
 * @author peanutnowing
 */
public class PublishOrder {

    public PublishOrder(JedisPool jedisPool, String channelName) {
        System.out.println("publisher order start ");
        try (Jedis jedis = jedisPool.getResource()) {
            int sleepTime = 0;
            for (int i = 0; i < 10; i++) {
                sleepTime = new Random().nextInt(10) + 1;

                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                jedis.publish(channelName, "order sleep " + sleepTime);
            }
            jedis.publish(channelName, "");
        }
    }
}
