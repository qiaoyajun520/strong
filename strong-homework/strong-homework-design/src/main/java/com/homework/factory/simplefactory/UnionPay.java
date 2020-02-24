package com.homework.factory.simplefactory;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-02-24 23:08
 */
public class UnionPay implements IPayment {
    @Override
    public void pay() {
        System.out.println("银联支付");
    }
}
