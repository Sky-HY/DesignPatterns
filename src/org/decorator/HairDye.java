package org.decorator;

public class HairDye extends Decorator {
    public HairDye(Animal animal) {
        super(animal);
        System.out.println("毛发染色");
    }
}
