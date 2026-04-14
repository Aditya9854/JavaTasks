package com.sb.NPluseOne.repository;

import com.sb.NPluseOne.entity.Customer;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Long> {

    //Fetch join (Manual JPQL)
    @Query("SELECT c FROM Customer c JOIN FETCH c.addresses")
    List<Customer>findAllWithAddressesFetchJoin();

    //EntityGraph
    @EntityGraph(attributePaths = {"addresses"})
    @Query("SELECT c FROM Customer c")
    List<Customer> findAllWithAddressesEntityGraph();

}
