package com.homework.factory.abstractfactory;

/**
 * @Author: QiaoYaJun
 * @Description 抽象工厂
 * @Created 2020-02-25 21:07
 */
public abstract class PaymentFactory {
    protected abstract IPayment createPayment();

    protected abstract IRefusePayment createRefusePayment();
}
