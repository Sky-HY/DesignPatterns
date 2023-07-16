package org.factorymethod.example;

public class DivOperation extends Operation {


    @Override
    public double getResult() {
        if (numB == 0.0){
            throw new IllegalArgumentException("除数是0");
        }
        return numA / numB;
    }
}
