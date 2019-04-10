package com.review.concurrent.threadtest;

import java.util.concurrent.TimeUnit;

/**
 * @Author: QiaoYaJun
 * @Description 线程通讯
 * @Created 2019-04-05 10:06
 */
public class InterruptcommunicateDemo {
    public static void main(String[] args) throws
            InterruptedException {
        Thread thradA = new Thread(() -> {
            for (; ; ) {
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("A");
                    Thread.interrupted();
                }
            }
        });
        Thread thradB = new Thread(() -> {
            for (; ; ) {
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("B");
                    Thread.interrupted();
                }
            }
        });
        thradB.interrupt();
    }
}
