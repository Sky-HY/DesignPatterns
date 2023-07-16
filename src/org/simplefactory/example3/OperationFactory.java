package org.simplefactory.example3;

/**
 * Operation简单工厂，根据需要创建对应的Operation
 */
public class OperationFactory {
    public static Operation createOperation(String op) {
        Operation operation;
        switch (op) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MultiplyOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
            default:
                throw new IllegalArgumentException("无效的符号：" + op);
        }
        return operation;
    }
}
