package com.udemy.section14.composite_example_2;

public class Main {

    public static void main(String[] args) {

        Employee developer1 = new Developer("Mateusz", 1, "Junior");
        Employee developer2 = new Developer("Antos", 2, "Regular");
        Directory directory1 = new Directory();
        directory1.addEmployee(developer1);
        directory1.addEmployee(developer2);

        Employee manager1 = new Manager("Beata", 3, "Senior");
        Employee manager2 = new Manager("Rozalia", 4, "Entry");

        Directory directory2 = new Directory();
        directory2.addEmployee(manager1);
        directory2.addEmployee(manager2);

        Directory companyDir = new Directory();
        companyDir.addEmployee(directory1);
        companyDir.addEmployee(developer2);
        companyDir.addEmployee(directory2);

        companyDir.showEmployeeDetails();
    }
}
