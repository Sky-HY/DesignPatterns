package org.singlecase.example;

/**
 * 饿汉单例
 *
 * @author Ben Yang
 * @date 2022/8/12 10:49
 * @since 1.0
 */
public class Person {
    private static final Person PERSON = new Person();

    private Person() {
    }

    public static Person getInstance(){
        return PERSON;
    }

    public void say(){
        System.out.println("hello");
    }
}
