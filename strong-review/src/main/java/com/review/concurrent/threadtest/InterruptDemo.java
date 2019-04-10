package com.review.concurrent.threadtest;

import java.util.concurrent.TimeUnit;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2019-04-05 10:06
 */
public class InterruptDemo {
    private static int i;
    public static void main(String[] args) throws
            InterruptedException {
        Thread thread=new Thread(()->{
            while(!Thread.currentThread().isInterrupted()){
                i++;
            }
            System.out.println("Num:"+i);
        },"interruptDemo");
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();
    }
}
