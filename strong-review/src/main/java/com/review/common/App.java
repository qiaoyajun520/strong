package com.review.common;

import java.util.HashMap;

/**
 * Hello world!
 */
public class App {
    public static ThreadLocal<Integer> local = new ThreadLocal<>();

    public static void main(String[] args) {
        Integer a=100;
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("1", 1);
        System.out.println(Math.round(2.6));
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                //TODO
            }
            System.out.println("ss");
        });
        thread.start();
        StringBuilder sb =new StringBuilder();
        thread.interrupt();
    }
}
