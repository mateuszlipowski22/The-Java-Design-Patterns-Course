package com.udemy.section23.challenge;

public class Client {

    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWOmanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWOman = getMarriedWOmanExpression();

        Context context = new Context("John");
        System.out.println("John is male? "+isMale.interpret(context));

        context = new Context("Married Julie");
        System.out.println("Julie is married woman? "+isMarriedWOman.interpret(context));

        context = new Context("Lucie");
        System.out.println("Julie is male? "+isMarriedWOman.interpret(context));
    }

}
