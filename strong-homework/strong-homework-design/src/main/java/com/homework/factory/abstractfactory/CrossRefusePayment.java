package com.homework.factory.abstractfactory;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-02-24 23:08
 */
public class CrossRefusePayment implements IRefusePayment {


    @Override
    public void refusePay() {
        System.out.println("跨境拒付");
    }
}
