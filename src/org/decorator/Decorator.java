package org.decorator;

public class Decorator extends Animal{

    private final Animal animal;

    public Decorator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void show() {
        animal.show();
    }
}
