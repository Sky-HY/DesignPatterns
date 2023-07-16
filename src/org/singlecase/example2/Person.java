package org.singlecase.example2;

/**
 * 懒汉单例
 *
 * @author Ben Yang
 * @date 2022/8/12 17:26
 * @since 1.0
 */
public class Person {
    private static volatile Person PERSON;

    private Person() {
    }

    public static Person getInstance() {
        if (PERSON == null) {
            synchronized (Person.class) {
                if (PERSON == null){
                    /*
                        需要使用volatile禁止指令重排，2和3可能会交换顺序，可能会导致其他线程得到一个无效的对象
                        1.申请空间
                        2.初始化数据
                        3.将地址赋值给PERSON
                     */
                    PERSON = new Person();
                }
            }
        }
        return PERSON;
    }

    public void say() {
        System.out.println("hello");
    }
}
