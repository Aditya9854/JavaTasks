package com.sp.resource;

import com.sp.beans.Address;
import com.sp.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean
    public Address createAddObj()
    {
        Address addr = new Address();

        addr.setHouseNo(1302);
        addr.setCity("Pune");
        addr.setPincode(411051);

        return addr;
    }

    @Bean
    public Employee createEmpObj()
    {
        Employee emp = new Employee();

        emp.setEmpId(194);
        emp.setName("Sundar");
        emp.setAddress(createAddObj());

        return emp;
    }

}
