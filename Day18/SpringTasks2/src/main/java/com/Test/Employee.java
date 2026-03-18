package com.Test;

public class Employee {

    private int id;
    private String name;
    private Department department;   //Object dependency

    //default constructor
    public Employee()
    {
        System.out.println("Employee Constructor called!");
    }

    //Lifecycle: Init Method
    public void myInit(){
        System.out.println(">> Init Method: Employee "+name+" is ready.");
    }
    //Lifecycle: Destroy Method
    public void myDestroy() {
        System.out.println(">> Destroy Method : Cleaning up Employee "+name);
    }

    //Setters
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
        System.out.println("Hashcode : "+this.hashCode()+" | Name : "+name);
    }

}
