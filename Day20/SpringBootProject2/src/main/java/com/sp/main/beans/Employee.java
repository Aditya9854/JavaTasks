package com.sp.main.beans;

public class Employee {

    private int  empID;
    private String name;
    private String email;


    public Employee(int empID, String name, String email) {
        this.empID = empID;
        this.name = name;
        this.email = email;
    }

    public void display()
    {
        System.out.println("Employee ID : "+empID);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Email ID : "+email);
    }
}
