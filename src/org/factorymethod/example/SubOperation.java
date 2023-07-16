package org.factorymethod.example;

public class SubOperation extends Operation {


    @Override
    public double getResult() {
        return numA - numB;
    }
}
