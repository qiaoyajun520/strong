package com.strong.common;


/**
 * Hello world!
 */
public class App {
    public static ThreadLocal<Integer> local = new ThreadLocal<>();

    public static void main(String[] args) {
        System.out.println(Math.round(2.6));
    }
}
