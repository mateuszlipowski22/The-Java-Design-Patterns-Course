package com.udemy.section29.solution;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        int result = context.executeStrategy(new OperationAdd(), 10, 2);

        System.out.println("10 + 2 = " + result);

        result = context.executeStrategy(new OperationSubtract(), 10, 2);
        System.out.println("10 - 2 = " + result);

        result = context.executeStrategy(new OperationMultiply(), 10, 2);
        System.out.println("10 * 2 = " + result);
    }
}
