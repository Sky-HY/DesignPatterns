package org.abstractfactory.example2;

public class AppleFactory implements IFactory{
    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public TV createTV() {
        return new AppleTV();
    }
}
