package org.decorator;

public class Dress extends Decorator{
    public Dress(Animal animal) {
        super(animal);
        System.out.println("穿衣");
    }
}
