package com.homework.decorator;


/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-03-01 11:10
 */
public class Test {
    public static void main(String[] args) {
        //未登录用户
        BaseNavigation baseNavigation = new BaseNavigation();
        INavigation navigation = new GuestNavigationDecorator(baseNavigation);
        System.out.println(navigation.getNav());
        System.out.println("----------------------------");
        //登录用户
        navigation = new VipNavigationDecorator(navigation);
        System.out.println(navigation.getNav());
    }
}
