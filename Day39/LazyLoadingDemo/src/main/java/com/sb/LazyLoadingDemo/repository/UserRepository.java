package com.sb.LazyLoadingDemo.repository;

import com.sb.LazyLoadingDemo.dto.UserOrderDTO;
import com.sb.LazyLoadingDemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    //optimization :Fetch join (solves n+1 by joining tables in 1 query)
    @Query("SELECT u from User u JOIN FETCH u.orders")
    List<User>findAllUsersWithOrders();

    //optimization dto projection(fetches only specific columns)
    @Query("SELECT new com.sb.LazyLoadingDemo.dto.UserOrderDTO(u.name,o.product)"+"FROM User u JOIN u.orders o")
    List<UserOrderDTO>findOrderDetailsDTO();
}
