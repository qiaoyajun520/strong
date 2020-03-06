package com.homework.decorator;

/**
 * @Author: QiaoYaJun
 * @Description Vip，已登录
 * @Created 2020-03-06 22:33
 */
public class VipNavigationDecorator extends GuestNavigationDecorator {

    public VipNavigationDecorator(INavigation navigation) {
        super(navigation);
    }

    @Override
    public String getNav() {
        return super.getNav() + "，作业，题库，成长墙";
    }
}
