package org.factorymethod.example;

public class DivFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new DivOperation();
    }
}
