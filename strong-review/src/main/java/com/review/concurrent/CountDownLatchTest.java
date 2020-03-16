package com.review.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-03-16 22:56
 */
public class CountDownLatchTest {
    /**
     * CountDownLatch允许一个或多个线程等待其他线程完成操作
     */
    static CountDownLatch c = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                c.countDown();
                System.out.println(2);
                c.countDown();
            }
        }).start();
        c.await();
        System.out.println("3");
    }
}