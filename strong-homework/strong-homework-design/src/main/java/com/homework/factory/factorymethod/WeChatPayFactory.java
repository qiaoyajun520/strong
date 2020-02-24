package com.homework.factory.factorymethod;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-02-24 23:12
 */
public class WeChatPayFactory implements IPaymentFactory {

    @Override
    public IPayment create() {
        return new WeChatPay();
    }
}
