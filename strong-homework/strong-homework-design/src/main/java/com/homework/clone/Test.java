package com.homework.clone;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-03-01 11:10
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(12);
        student.setName("谯亚军");
        List likes= new ArrayList();
        likes.add("羽毛球");
        student.setLikes(likes);
//        Student student2 = student.clone();
//        student2.setName("张三");
//        student2.getLikes().add("足球");
//        System.out.println(student.toString());
//        System.out.println(student2.toString());
        System.out.println("---------深克隆------------");
        Student student3 = student.deepClone();
        student3.getLikes().add("足球");
        System.out.println(student.toString());
        System.out.println(student3.toString());
    }
}
