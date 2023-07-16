package org.abstractfactory.example;

public class MysqlDepOperation implements DepOperation {
    @Override
    public void addDep() {
        System.out.println("mysql 新增部门");

    }

    @Override
    public void getDepById() {
        System.out.println("mysql 根据id查询部门");

    }
}
