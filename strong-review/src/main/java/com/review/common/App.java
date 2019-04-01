package com.review.common;


/**
 * Hello world!
 */
public class App {
    public static ThreadLocal<Integer> local = new ThreadLocal<>();
    static int a = 12;

    public static void main(String[] args) {
        String s1 = "a";

        String s2 = s1 + "b";

        String s3 = "a" + "b";

        System.out.println(s2 == "ab");

        System.out.println(s3 == "ab");
        String s = "a" + "b" + "c" + "d";

        System.out.println(s == "abcd");
        System.out.println(TestClass.test());
    }

    public static class TestClass {
        public static int test() {
            int b = App.a + 2;
            return b;
        }
    }
}
