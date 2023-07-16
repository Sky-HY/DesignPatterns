package org.factorymethod.example2;

public class UndergraduateFactory implements LeiFengFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
