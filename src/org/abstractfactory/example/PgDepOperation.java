package org.abstractfactory.example;

public class PgDepOperation implements DepOperation{
    @Override
    public void addDep() {
        System.out.println("pg 新增部门");
    }

    @Override
    public void getDepById() {
        System.out.println("pg 根据id查询部门");
    }
}
