package org.abstractfactory.example;

public class MysqlUserOperation implements UserOperation {
    @Override
    public void addUser() {
        System.out.println("mysql 新增用户");
    }

    @Override
    public void getUserById() {
        System.out.println("mysql 根据id查询用户");
    }
}
