package com.udemy.section14.composite_example_2;

public class Main {

    public static void main(String[] args) {

        Employee developer1 = new Developer("Mateusz", 1, "Junior");
        Employee developer2 = new Developer("Antos", 2, "Regular");

        Manager manager1 = new Manager("Beata", 25000);
        manager1.addEmployee(developer1);
        manager1.addEmployee(developer2);

        Employee developer3 = new Developer("Michal", 3, "Junior");
        Employee developer4 = new Developer("Adam", 4, "Regular");

        Manager general = new Manager("Halina" , 50000);
        general.addEmployee(developer3);
        general.addEmployee(developer4);
        general.addEmployee(manager1);

        general.showEmployeeDetails();
    }
}
