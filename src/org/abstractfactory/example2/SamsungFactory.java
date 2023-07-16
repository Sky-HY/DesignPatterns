package org.abstractfactory.example2;

public class SamsungFactory implements IFactory{
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public TV createTV() {
        return new SamsungTV();
    }
}
