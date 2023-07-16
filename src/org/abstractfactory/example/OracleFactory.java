package org.abstractfactory.example;

/**
 * Oracle工厂，创建Oracle相关的产品
 */
public class OracleFactory implements IFactory {
    @Override
    public UserOperation createUserOperation() {
        return new OracleUserOperation();
    }

    @Override
    public DepOperation createDepOperation() {
        return new OracleDepOperation();
    }
}
