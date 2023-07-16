package org.simplefactory.example3;

import java.util.Scanner;

/**
 * 面向对象，将运算操作封装为一个对象
 * 优点：
 *      可拓展
 *      可复用
 *      可维护
 *      灵活性好
 *      松耦合，不同Operation的逻辑、Operation创建、Operation使用分开了
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numA = sc.nextDouble();
        String op = sc.next();
        double numB = sc.nextDouble();

        Operation operation = OperationFactory.createOperation(op);
        operation.setNumA(numA);
        operation.setNumB(numB);
        double result = operation.getResult();
        System.out.println(result);

    }
}
