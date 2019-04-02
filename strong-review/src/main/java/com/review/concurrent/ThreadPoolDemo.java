package com.review.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created in 14:44 on 2019/4/1.
 */
public class ThreadPoolDemo extends Thread {
    static ExecutorService excutor = Executors.newFixedThreadPool(3);

    @Override
    public void run() {
        for (; ; ) {
            System.out.println("当前线程:" + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();
        condition.await();
        condition.signal();
        excutor.execute(new ThreadPoolDemo());
        excutor.execute(new ThreadPoolDemo());
    }
}
