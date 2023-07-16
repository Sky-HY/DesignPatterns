package org.factorymethod.example;

/**
 * 使用计算机案例来实现工厂方法模式
 */
public class Test {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // double numA = sc.nextDouble();
        // String op = sc.next();
        // double numB = sc.nextDouble();

        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNumA(1);
        operation.setNumB(2);
        double result = operation.getResult();
        System.out.println(result);
    }
}
