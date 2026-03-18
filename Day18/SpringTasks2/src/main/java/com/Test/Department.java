package com.Test;

public class Department {
    private String depName;

    //Constructor for constructor injection
    public Department(String depName)
    {
        this.depName = depName;
    }

    @Override
    public String toString()
    {
        return "Department Name=[" +depName+ "]";
    }
}
