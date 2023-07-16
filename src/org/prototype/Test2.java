package org.prototype;

import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Resume resume = new Resume("zs", 20, '男');
        resume.setDate(new Date());
        Resume resume1 = resume.clone();
        Resume resume2 = resume.clone();

        Date date = resume.getDate();
        date.setYear(2022);

        System.out.println(resume);
        System.out.println(resume1);
        System.out.println(resume2);
    }
}
