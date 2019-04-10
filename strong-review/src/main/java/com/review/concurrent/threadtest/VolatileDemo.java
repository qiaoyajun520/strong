package com.review.concurrent.threadtest;


/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2019-04-05 10:32
 */
public class VolatileDemo {
    private volatile static boolean stop = false;

    public static void main(String[] args) throws
            InterruptedException {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (!stop) {
                i++;
            }
        });
        thread.start();
        System.out.println("begin start thread");
        Thread.sleep(1000);
        stop = true;


    }
}
