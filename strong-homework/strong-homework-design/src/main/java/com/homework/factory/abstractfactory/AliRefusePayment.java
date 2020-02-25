package com.homework.factory.abstractfactory;

/**
 * @Author: QiaoYaJun
 * @Description 支付宝拒付
 * @Created 2020-02-24 23:08
 */
public class AliRefusePayment implements IRefusePayment {

    @Override
    public void refusePay() {
        System.out.println("支付宝拒付");
    }
}
