package com.udemy.section14.challenge;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty{

    private String name;
    private String departement;

    public Supervisor(String name, String departement) {
        this.name = name;
        this.departement = departement;
    }

    private List<Faculty> facultyList = new ArrayList<>();

    public void addFaculty(Faculty faculty){
        facultyList.add(faculty);
    }

    public void removeFaculty(Faculty faculty){
        facultyList.remove(faculty);
    }

    public String getDepartement() {
        return departement;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getDetails() {
        System.out.println("My department is "+getDepartement());
        System.out.println("My name is "+name);
        System.out.println("In my department there are:");
        for(Faculty faculty:facultyList){
            faculty.getDetails();
        }
    }
}
