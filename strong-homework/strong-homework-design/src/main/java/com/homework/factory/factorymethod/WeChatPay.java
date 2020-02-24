package com.homework.factory.factorymethod;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-02-24 23:08
 */
public class WeChatPay implements IPayment {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
