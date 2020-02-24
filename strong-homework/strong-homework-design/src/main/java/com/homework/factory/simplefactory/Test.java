package com.homework.factory.simplefactory;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-02-24 23:18
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 简单工厂适用于工厂类负责创建的对象较少的场景，且客户端只需要
         * 传入工厂类的参数，对于如何创建对象的逻辑不需要关心。
         * 简单工厂也有它的缺点：工厂类的职责相对过重，不易于扩展过于复杂的产品结构。
         */
        SimpleFactory simpleFactory = new SimpleFactory();
        IPayment pay = simpleFactory.create(UnionPay.class);
        pay.pay();
    }
}
