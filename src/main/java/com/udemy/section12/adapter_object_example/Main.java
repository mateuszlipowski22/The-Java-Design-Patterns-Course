package com.udemy.section12.adapter_object_example;

public class Main {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says...");
        wildTurkey.fly();
        wildTurkey.gobble();

        System.out.println("The duck says...");
        testDuck(mallardDuck);

        System.out.println("The turkey adapter says...");
        testDuck(turkeyAdapter);

    }
    public static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }

}
