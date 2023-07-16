package org.factorymethod.example2;

/**
 * 抽象的雷锋工厂，创建雷锋
 */
public class Test {
    public static void main(String[] args) {
        LeiFengFactory leiFengFactory = new VolunteerFactory();
        LeiFeng leiFeng = leiFengFactory.createLeiFeng();
        leiFeng.sweep();
        leiFeng.wash();
        leiFeng.buyRice();
    }
}
