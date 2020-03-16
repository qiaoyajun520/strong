package com.review.concurrent;

import java.util.concurrent.CyclicBarrier;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-03-16 22:51
 */
public class CyclicBarrierTest {

    /**
     * CyclicBarrier默认的构造方法是CyclicBarrier（int parties），其参数表示屏障拦截的线程数
     * 量，每个线程调用await方法告诉CyclicBarrier我已经到达了屏障，然后当前线程被阻塞
     */


    static CyclicBarrier c = new CyclicBarrier(3);

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    c.await();
                } catch (Exception e) {
                }
                System.out.println(1);
            }
        }).start();
        try {
            c.await();
        } catch (Exception e) {
        }
        System.out.println(2);
    }
}