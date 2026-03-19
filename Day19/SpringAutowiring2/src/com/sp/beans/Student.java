package com.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

    private int rollNo;
    private String name;

    @Autowired
    @Qualifier("createAddrObj2")
    private Address address;

    @Autowired
    private Subjects subjects;


    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void display()
    {
        System.out.println("Student RollNO : "+rollNo);
        System.out.println("Student Name : "+name);
        System.out.println("Student Address : "+address);
        System.out.println("Student Subjects : "+subjects);
    }
}
