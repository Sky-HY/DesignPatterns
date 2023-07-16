package org.simplefactory.example;

import java.util.Scanner;

/**
 * 版本一
 * 硬编码的
 *      1.无法复用、智能copy代码，
 *      2.无法拓展，必须改动原来稳定的代码
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numA = sc.nextDouble();
        String op = sc.next();
        double numB = sc.nextDouble();
        double result;

        if ("+".equals(op)) {
            result = numA + numB;
        } else if ("-".equals(op)) {
            result = numA - numB;
        } else if ("*".equals(op)) {
            result = numA * numB;
        } else if ("/".equals(op)) {
            result = numA / numB;
        } else {
            throw new IllegalArgumentException("不支持的操作：" + op);
        }

        System.out.println(result);
    }
}
