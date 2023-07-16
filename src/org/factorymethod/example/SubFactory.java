package org.factorymethod.example;

public class SubFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new SubOperation();
    }
}
