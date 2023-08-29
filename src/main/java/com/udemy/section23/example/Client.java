package com.udemy.section23.example;

import java.util.Objects;

public class Client {
    public InterpreterContext interpreterContext;

    public Client(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    public String interpret(String string) {
        Expression expression = null;
        if(string.contains("Hexadecimal")){
            expression=new IntToHexExpression(Integer.parseInt(string.substring(0, string.indexOf(' '))));
        }else if(string.contains("Binary")){
            expression=new IntToBinaryExpression(Integer.parseInt(string.substring(0, string.indexOf(' '))));
        }
        return Objects.nonNull(expression) ? expression.interpret(interpreterContext) : null;
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";
        String str3 = "45 in Hexadecimal";
//        Client client = new Client(new InterpreterContext());
//        System.out.println(str1 + " is " + client.interpret(str1));
//        Client client = new Client(new InterpreterContext());
//        System.out.println(str2 + " is " + client.interpret(str2));
        printInterpretation(str1);
        printInterpretation(str2);
        printInterpretation(str3);
    }

    private static void printInterpretation(String str1) {
        Client client = new Client(new InterpreterContext());
        System.out.println(str1 + " is " + client.interpret(str1));
    }


}
