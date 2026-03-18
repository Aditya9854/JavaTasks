package com.sp;

public class Employee {

    private int id;
    private String name;
    private Department department;   //Object dependency

    //default constructor
    public Employee(){}

    //Constructor for Constructor injection
    public Employee(int id,String name,Department department)
    {
        this.id = id;
        this.name = name;
        this.department = department;

    }

    //getter and setters for setter injection
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setDepartment(Department department)
    {
        this.department = department;
    }

    public void displayDetails()
    {
        System.out.println("ID : "+id+" | Name : "+name+" | "+department);
    }

}
