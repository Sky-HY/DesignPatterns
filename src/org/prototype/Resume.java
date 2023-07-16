package org.prototype;

import java.util.Date;

public class Resume implements Cloneable{
    private String name;
    private int age;
    private char sex;

    private Date date;

    public Resume(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", date=" + date +
                '}';
    }

    @Override
    public Resume clone() {
        Resume clone = null;
        try {
            clone = (Resume) super.clone();
            clone.setDate((Date) date.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
