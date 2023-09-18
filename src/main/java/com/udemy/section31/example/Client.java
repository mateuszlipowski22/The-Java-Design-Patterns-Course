package com.udemy.section31.example;

public class Client {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
                new Book(20, "1234"),
                new Book(100, "5678"),
                new Fruit(100, 3, "Banana"),
                new Fruit(20, 2, "Apple"),
                new Book(100, "26265")
        };

         int total = calculatePrice(items);

        System.out.println("Total cost = "+total);
    }

    public static int calculatePrice(ItemElement[] itemElement){
        ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (int i = 0; i < itemElement.length; i++) {
            sum+=itemElement[i].accept(shoppingCartVisitor);
        }
        return sum;
    }
}
