package com.sb.LazyLoadingDemo.service;

import com.sb.LazyLoadingDemo.dto.UserOrderDTO;
import com.sb.LazyLoadingDemo.entity.User;
import com.sb.LazyLoadingDemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public void observerPerformance()
    {
        //n+1 (lazy loading trigger)
        System.out.println("-------Start lazy loading task-------");
        List<User>users = userRepository.findAll();
        users.forEach(u ->System.out.println(u.getName()+"has"+u.getOrders().size()+" orders"));

        //optimized with fetch join
        System.out.println("------Starting fetch join test---------");
        List<User>optimizedUser = userRepository.findAllUsersWithOrders();

        //optimized with dto
        System.out.println("------Starting dto projection test---------");
        List<UserOrderDTO>dtos = userRepository.findOrderDetailsDTO();
    }
}
