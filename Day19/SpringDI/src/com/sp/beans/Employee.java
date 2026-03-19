package com.sp.beans;

public class Employee {

    private int empId;
    private  String name;
    private Address address;


    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public void display()
    {
        System.out.println("Employee ID : "+empId);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Address : "+address);
    }
}
