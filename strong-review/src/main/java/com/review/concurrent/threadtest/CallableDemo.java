package com.review.concurrent.threadtest;

import java.util.concurrent.*;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2019-04-05 9:27
 */
public class CallableDemo implements Callable<String> {
    public static void main(String[] args) throws ExecutionException,
            InterruptedException {
        ExecutorService executorService=
                Executors.newFixedThreadPool(1);
        CallableDemo callableDemo=new CallableDemo();
        Future<String> future=executorService.submit(callableDemo);
        System.out.println(future.get());
        new Thread().start();
        executorService.shutdown();
    }
    @Override
    public String call() throws Exception {
        int a=1;
        int b=2;
        System.out.println(a+b);
        return "执行结果:"+(a+b);
    }
}
