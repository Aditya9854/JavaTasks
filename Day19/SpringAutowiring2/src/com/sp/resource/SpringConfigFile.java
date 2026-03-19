package com.sp.resource;

import com.sp.beans.Address;
import com.sp.beans.Student;
import com.sp.beans.Subjects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createAddrObj1()
    {
        Address addr = new Address();

        addr.setHouseNo(102);
        addr.setCity("Mumbai");
        addr.setPincode(415121);

        return addr;
    }
    @Bean
    public Address createAddrObj2()
    {
        Address addr = new Address();

        addr.setHouseNo(104);
        addr.setCity("Nagpur");
        addr.setPincode(415122);

        return addr;
    }

    @Bean
    public Subjects createSubObj()
    {
        Subjects sub = new Subjects();

        List<String> subject_List = new ArrayList<String>();

        subject_List.add("Java");
        subject_List.add("Python");
        subject_List.add("CPP");

        sub.setSubjects(subject_List);

        return sub;
    }
    @Bean
    public Student createStdObj()
    {
        Student std = new Student();

        std.setRollNo(15);
        std.setName("Amit");

        return std;
    }
}
