package org.abstractfactory.example;

public class PgFactory implements IFactory{
    @Override
    public UserOperation createUserOperation() {
        return new PgUserOperation();
    }

    @Override
    public DepOperation createDepOperation() {
        return new PgDepOperation();
    }
}
