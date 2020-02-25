package com.homework.factory.abstractfactory;


/**
 * @Author: QiaoYaJun
 * @Description 支付宝工厂
 * @Created 2020-02-24 23:12
 */
public class AliPayFactory extends PaymentFactory {


    @Override
    protected IPayment createPayment() {
        return new AliPay();
    }

    @Override
    protected IRefusePayment createRefusePayment() {
        return new AliRefusePayment();
    }
}
