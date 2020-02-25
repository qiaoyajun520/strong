package com.homework.factory.abstractfactory;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-02-24 23:08
 */
public class AliPay implements IPayment {
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
