package com.homework.factory.abstractfactory;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-02-24 23:12
 */
public class CrossPayFactory extends PaymentFactory {


    @Override
    protected IPayment createPayment() {
        return new CrossPay();
    }

    @Override
    protected IRefusePayment createRefusePayment() {
        return new CrossRefusePayment();
    }
}
