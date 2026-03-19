package com.Test.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("1001")
    private int id;
    @Value("Ram")
    private String name;
    @Value("96.00f")
    private float marks;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Marks : "+marks);
    }
}
