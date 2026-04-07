package com.sb.main.runner;

import com.sb.main.model.User;
import com.sb.main.repository.UserRepository;
import com.sb.main.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CacheTestRunner implements CommandLineRunner {

    private final UserService userService;
    private final UserRepository userRepository;

    public CacheTestRunner(UserService userService,UserRepository userRepository)
    {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // 1. Create and save without setting the ID manually
        User user = new User();
        user.setName("Anup kumar");
        // Capture the saved user to get the generated ID
        User savedUser = userRepository.save(user);
        Long id = savedUser.getId();

        System.out.println("---- Starting Cache Test -----");

        System.out.println("First call (DB Hit):");
        User cachedUser = userService.geUserById(id);

        System.out.println("Updating user...");
        cachedUser.setName("Anup s kumar");
        userService.updateUser(cachedUser); // Ensure this method uses @CacheEvict or @CachePut

        System.out.println("Second call (Should be Cache Hit/Updated):");
        User freshUser = userService.geUserById(id);
        System.out.println("User Name: " + freshUser.getName());
    }
}
