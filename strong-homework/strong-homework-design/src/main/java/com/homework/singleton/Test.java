package com.homework.singleton;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-03-01 11:10
 */
public class Test {
    public static void main(String[] args) {
        //其它单例请参考 https://www.jianshu.com/p/d35f244f3770
        Student student = (Student) ContainerSingleton.getInstance("com.homework.singleton.Student");
        Student student2 = (Student) ContainerSingleton.getInstance("com.homework.singleton.Student");
        System.out.println(student == student2);
    }
}
