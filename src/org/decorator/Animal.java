package org.decorator;

public abstract class Animal {
    private String name;


    public abstract void show();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
