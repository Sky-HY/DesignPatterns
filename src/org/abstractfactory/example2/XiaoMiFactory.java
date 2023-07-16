package org.abstractfactory.example2;

public class XiaoMiFactory implements IFactory{
    @Override
    public Phone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public TV createTV() {
        return new XiaoMiTV();
    }
}
