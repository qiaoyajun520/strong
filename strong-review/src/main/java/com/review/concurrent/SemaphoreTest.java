package com.review.concurrent;

import com.strong.concurrent.TheadLocalTest;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created in 17:08 on 2019/3/18.
 */
public class SemaphoreTest {
    /**
     * 介绍
     * 　　信号量(Semaphore)，有时被称为信号灯，是在多线程环境下使用的一种设施, 它负责协调各个线程, 以保证它们能够正确、合理的使用公共资源。
     *
     * 概念
     * 　　Semaphore分为单值和多值两种，前者只能被一个线程获得，后者可以被若干个线程获得。
     *
     * 　　Semaphore当前在多线程环境下被扩放使用，操作系统的信号量是个很重要的概念，在进程控制方面都有应用。Java并发库Semaphore 可以很轻松完成信号量控制，
     *    Semaphore可以控制某个资源可被同时访问的个数，通过 acquire() 获取一个许可，如果没有就等待，而 release() 释放一个许可。
     *    比如在Windows下可以设置共享文件的最大客户端访问个数。
     *
     * 　　单个信号量的Semaphore对象可以实现互斥锁的功能，并且可以是由一个线程获得了“锁”，再由另一个线程释放“锁”，这可应用于死锁恢复的一些场合。
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService pool =  Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(3,true);
        final ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();//获取信号灯许可
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println("Thread "+Thread.currentThread().getName()+" 进入" +"当前系统的并发数是："+(3-semaphore.availablePermits()));
                    try {
                        Thread.sleep(new Random().nextInt(1000));
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println("Thread "+Thread.currentThread().getName()+" 即将离开");
                    semaphore.release();//释放信号灯
                    System.out.println("Thread "+Thread.currentThread().getName()+" 已经离开，当前系统的并发数是："+(3-semaphore.availablePermits()));
                }
            };
            pool.execute(runnable);

        }
    }
}
