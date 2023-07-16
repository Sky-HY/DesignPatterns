package org.simplefactory.example2;

public class Operation {
    public static double getResult(double numA, double numB, String op) {
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
        return result;
    }
}
