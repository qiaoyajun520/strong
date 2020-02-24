package com.homework.factory.factorymethod;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-02-24 23:18
 */
public class Test {
    public static void main(String[] args) {
        /**
         工厂方法适用于以下场景：
         1、创建对象需要大量重复的代码。
         2、客户端（应用层）不依赖于产品类实例如何被创建、实现等细节。
         3、一个类通过其子类来指定创建哪个对象。
         工厂方法也有缺点：
         1、类的个数容易过多，增加复杂度。
         2、增加了系统的抽象性和理解难度。
         */
        AliPayFactory aliPayFactory = new AliPayFactory();
        IPayment pay = aliPayFactory.create();
        pay.pay();
    }
}
