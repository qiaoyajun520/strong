package com.review.jvm;


import java.util.concurrent.TimeUnit;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created in 10:05 on 2019/3/20.
 */
public class Test {
    public static void main (String[] args) throws InterruptedException {
        System.out.println("主线程加载");
        TimeUnit.SECONDS.sleep(2);
    }
}
