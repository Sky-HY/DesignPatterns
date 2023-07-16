package org.decorator;

public class Dog extends Animal{

    @Override
    public void show() {
        System.out.println("狗："+getName());
    }
}
