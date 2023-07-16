package org.composite;

public class HrDepartment extends Company{
    public HrDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb);

    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+" 员工招聘培训管理");
    }
}
