package com.sb.NPluseOne;

import com.sb.NPluseOne.entity.Address;
import com.sb.NPluseOne.entity.Customer;
import com.sb.NPluseOne.repository.CustomerRepository;
import com.sb.NPluseOne.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class NPluseOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(NPluseOneApplication.class, args);
	}

	@Bean
	public CommandLineRunner runDemo(CustomerRepository repository, CustomerService service)
	{
		return args -> {

			Customer c1 = new Customer();
			c1.setName("ABC");

			Address a1 = new Address();
			a1.setCity("Mumbai");
			a1.setStreet("MD");
			a1.setCustomer(c1);

			Address a2 = new Address();
			a2.setCity("Pune");
			a2.setStreet("SP");
			a2.setCustomer(c1);
			c1.setAddresses(List.of(a1,a2));

			repository.save(c1);
			System.out.println("-------Data saved successfully------");

			service.demonstrateIssue();
		};
	}

}
