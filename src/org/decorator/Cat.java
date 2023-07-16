package org.decorator;

public class Cat extends Animal {
    @Override
    public void show() {
        System.out.println("猫：" + getName());
    }
}
