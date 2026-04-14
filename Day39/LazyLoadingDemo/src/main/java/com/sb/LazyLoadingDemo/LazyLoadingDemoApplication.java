package com.sb.LazyLoadingDemo;

import com.sb.LazyLoadingDemo.entity.Order;
import com.sb.LazyLoadingDemo.entity.User;
import com.sb.LazyLoadingDemo.repository.UserRepository;
import com.sb.LazyLoadingDemo.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LazyLoadingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LazyLoadingDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository repo, OrderService service)
	{
		return args -> {
			User u1 = new User();
			u1.setName("Aditya");

			Order o1 = new Order();
			o1.setProduct("Laptop");
			o1.setUser(u1);

			u1.getOrders().add(o1);
			repo.save(u1);

			service.observerPerformance();
		};
	}
}
