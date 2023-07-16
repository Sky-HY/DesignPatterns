package org.factorymethod.example2;

public class VolunteerFactory implements LeiFengFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
