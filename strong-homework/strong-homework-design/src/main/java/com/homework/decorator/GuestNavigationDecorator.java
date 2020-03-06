package com.homework.decorator;

/**
 * @Author: QiaoYaJun
 * @Description 游客，未登录
 * @Created 2020-03-06 22:33
 */
public class GuestNavigationDecorator implements INavigation {
    private INavigation navigation;

    public GuestNavigationDecorator(INavigation navigation) {
        this.navigation = navigation;
    }

    @Override
    public String getNav() {
        return this.navigation.getNav();
    }
}
