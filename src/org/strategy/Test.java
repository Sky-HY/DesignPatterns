package org.strategy;

public class Test {
    public static void main(String[] args) {
        double result = CashContext.getResult("满100减10", 110d);
        System.out.println(result);
    }
}
