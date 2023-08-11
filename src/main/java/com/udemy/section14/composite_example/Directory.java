package com.udemy.section14.composite_example;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee{

    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
        for(Employee employee:employeeList){
            employee.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }
}
