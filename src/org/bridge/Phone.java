package org.bridge;

public abstract class Phone {
    protected Software software;

    public Phone(Software software) {
        this.software = software;
    }

    public abstract void run();
}
