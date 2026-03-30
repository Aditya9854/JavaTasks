package com.sb.main.service;

import org.springframework.stereotype.Service;
import com.sb.main.model.User;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	public void registerUser(User user)
	{
		log.debug("Processing User registration for {}",user.getName());

		if(user.getAge() < 18)
		{
			log.warn("User {} is minor.Registration failed.",user.getName());
		}

		log.info("User {} Successfully registered with id :{}",user.getName(),user.getId());
	}
}
