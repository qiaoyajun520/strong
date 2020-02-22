package com.review.common;


import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 */
public class App {
    public static ThreadLocal<Integer> local = new ThreadLocal<>();
    static int a = 12;

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    System.out.println("线程异常1");
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("线程异常");
                    e.printStackTrace();
                }
            }


        });
        thread.start();
        thread.interrupt();
        String a = new String("123");
        String b = new String("123");
        System.out.println(a == b);
        System.out.println("------------");

        Integer c = -129;
        Integer d = -129;
        System.out.println(c == d);

//
//        String s1 = "a";
//
//        String s2 = s1 + "b";
//
//        String s3 = "a" + "b";
//
//        System.out.println(s2 == "ab");
//
//        System.out.println(s3 == "ab");
//        String s = "a" + "b" + "c" + "d";
//
//        System.out.println(s == "abcd");
//        System.out.println(TestClass.test());
    }

    public static class TestClass {
        public static int test() {
            int b = App.a + 2;
            return b;
        }
    }
}
