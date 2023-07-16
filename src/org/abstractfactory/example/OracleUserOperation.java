package org.abstractfactory.example;

public class OracleUserOperation implements UserOperation {
    @Override
    public void addUser() {
        System.out.println("oracle 新增用户");
    }

    @Override
    public void getUserById() {
        System.out.println("oracle 根据id查询用户");
    }
}
