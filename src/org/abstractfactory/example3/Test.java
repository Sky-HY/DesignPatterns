package org.abstractfactory.example3;

/**
 * 使用简单工厂改造抽象工厂，
 * 优点，简化了代码，客户端不依赖具体的工厂了
 * 缺点，违反了开闭原则，新增产品时需要修改工厂类
 */
public class Test {
    public static void main(String[] args) {
        Phone phone = CccFactory.createPhone();
        TV tv = CccFactory.createTV();

        phone.show();
        tv.show();
    }
}
