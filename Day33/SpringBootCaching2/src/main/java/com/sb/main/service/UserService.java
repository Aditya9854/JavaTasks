package com.sb.main.service;

import com.sb.main.model.User;
import com.sb.main.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository){
        this.repository =repository;
    }

    @Cacheable(value = "userCache",key = "#id")
    public User geUserById(Long id)
    {
        System.out.println(">>>Accessing Database for user Id : "+id);
        return repository.findById(id).orElse(null);
    }

    @Transactional
    @CachePut(value = "users",key = "#user.id")
    public User updateUser(User user)
    {
        return repository.save(user);
    }

    @CacheEvict(value = "users",key = "#id")
    public void deleteUser(Long id)
    {
        repository.deleteById(id);
    }
}
