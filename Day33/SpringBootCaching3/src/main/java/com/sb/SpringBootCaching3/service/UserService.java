package com.sb.SpringBootCaching3.service;

import com.sb.SpringBootCaching3.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Cacheable(value = "users",key = "#id")
    public User getUserById(Long id)
    {
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return new User(id,"User_"+id,"user"+id+"@example.com");
    }
}
