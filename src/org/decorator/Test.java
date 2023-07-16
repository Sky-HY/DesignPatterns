package org.decorator;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("fc");
        Decorator dress = new Dress(dog);
        Decorator hairDye = new HairDye(dress);
        hairDye.show();
    }
}
