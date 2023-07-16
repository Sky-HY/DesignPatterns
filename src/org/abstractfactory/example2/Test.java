package org.abstractfactory.example2;

/**
 * 抽象工厂IFactory，抽象产品TV、Phone
 * 优点：具体的产品被具体的工厂隐藏了，客户端不用耦合具体的产品
 * 缺点：新增抽象产品时，需要修改IFactory和所有具体的工厂
 */
public class Test {
    public static void main(String[] args) {
        IFactory factory = new SamsungFactory();
        Phone phone = factory.createPhone();
        TV tv = factory.createTV();
        phone.show();
        tv.show();
    }
}
