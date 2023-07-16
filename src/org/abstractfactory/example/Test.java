package org.abstractfactory.example;

/**
 * 抽象工厂模式
 */
public class Test {
    public static void main(String[] args) {
        IFactory factory = new PgFactory();
        UserOperation uo = factory.createUserOperation();
        uo.addUser();
        uo.getUserById();

        DepOperation depOp = factory.createDepOperation();
        depOp.addDep();
        depOp.getDepById();
    }
}
