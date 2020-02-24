package com.homework.factory.factorymethod;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-02-24 23:12
 */
public class SimpleFactory {
    public IPayment create(Class<? extends IPayment> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
