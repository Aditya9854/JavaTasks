package com.sp.resource;

import com.sp.beans.Address;
import com.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean
    public Address createAddrObj()
    {
        Address addr = new Address();

        addr.setHouseNo(124);
        addr.setCity("Pune");
        addr.setPincode(415110);

        return addr;
    }
    @Bean
    public Student createStdObj()
    {
        Student std = new Student();

        std.setRollNo(101);
        std.setName("Aditya");
//        std.setAddress(createAddrObj());       //Manual DI

        return std;
    }

}
