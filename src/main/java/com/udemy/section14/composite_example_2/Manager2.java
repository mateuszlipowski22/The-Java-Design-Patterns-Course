package com.udemy.section14.composite_example_2;

public class Manager2 implements Employee {

    private String name;
    private long empId;
    private String position;

    public Manager2(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId+ " "+name+ " "+position);
    }

}
