package com.homework.decorator;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-03-06 22:33
 */
public class BaseNavigation implements INavigation{
    @Override
    public String getNav() {
        return "问答，文章，精品课堂，冒泡，商城";
    }
}
