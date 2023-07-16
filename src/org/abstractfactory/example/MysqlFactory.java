package org.abstractfactory.example;

/**
 * mysql工厂，创建mysql相关的产品
 */
public class MysqlFactory implements IFactory {
    @Override
    public UserOperation createUserOperation() {
        return new MysqlUserOperation();
    }

    @Override
    public DepOperation createDepOperation() {
        return new MysqlDepOperation();
    }
}
