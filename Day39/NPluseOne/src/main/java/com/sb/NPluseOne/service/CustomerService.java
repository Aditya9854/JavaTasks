package com.sb.NPluseOne.service;

import com.sb.NPluseOne.entity.Customer;
import com.sb.NPluseOne.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    @Transactional(readOnly = true)
    public void demonstrateIssue()
    {
        //triggering n+1
        System.out.println("------Triggering N+1 Issue------");
        List<Customer>customers = customerRepository.findAll();
        for (Customer c: customers)
        {
            System.out.println("Customer: "+c.getName()+",Address: "+c.getAddresses().size());
        }
        //fetch join -resolved
        System.out.println("-------Resolved via fetch join-------");
        customerRepository.findAllWithAddressesFetchJoin();

        //EntityGraph -resolved
        System.out.println("-------Resolved via EntityGraph-------");
        customerRepository.findAllWithAddressesEntityGraph();


    }
}
