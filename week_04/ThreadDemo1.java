package com.ssm.simple.demo.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 *
 * 使用Future处理：
 */
public class ThreadDemo1 {

    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call()  {
                return random();
            }
        });
        new Thread(task).start();
        System.out.println("启动一个新线程，异步运行一个方法");

        try {
            System.out.println("获取异步结果："+task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束");

    }

    private static int random() {
        return new Random().nextInt();
    }

}
