package org.abstractfactory.example;

public class PgUserOperation implements UserOperation {
    @Override
    public void addUser() {
        System.out.println("pg 新增用户");
    }

    @Override
    public void getUserById() {
        System.out.println("pg 根据id查询用户");
    }
}
