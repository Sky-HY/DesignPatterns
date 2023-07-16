package org.abstractfactory.example;

public class OracleDepOperation implements DepOperation {
    @Override
    public void addDep() {
        System.out.println("oracle 新增部门");

    }

    @Override
    public void getDepById() {
        System.out.println("oracle 根据id查询部门");

    }
}
