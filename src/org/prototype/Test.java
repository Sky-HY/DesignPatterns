package org.prototype;

public class Test {
    public static void main(String[] args) {
        Resume resume = new Resume("zs", 20, '男');
        System.out.println(resume);
        Resume resume1 = new Resume("zs", 20, '男');
        System.out.println(resume1);
        Resume resume2 = new Resume("zs", 20, '男');
        System.out.println(resume2);
    }
}
