package org.abstractfactory.example;

/**
 * 抽象工厂
 */
public interface IFactory {
    UserOperation createUserOperation();

    DepOperation createDepOperation();


}
