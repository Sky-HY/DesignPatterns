package org.factorymethod.example;

public class MultiplyFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new MultiplyOperation();
    }
}
