package org.simplefactory.example2;

import java.util.Scanner;

/**
 * 版本二
 *      优点：
 *          封装，将计算逻辑抽取出去了
 *          可复用
 *      缺点：
 *          拓展性不好，添加和修改功能有可能会影响到其他的地方
 *          Operation的功能耦合在一起
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numA = sc.nextDouble();
        String op = sc.next();
        double numB = sc.nextDouble();

        double result = Operation.getResult(numA, numB, op);
        System.out.println(result);
    }
}
