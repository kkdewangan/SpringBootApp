package com.kamald.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.kamald.dao.UserRepository;
import com.kamald.model.User;

@Component
public class DataLoader implements ApplicationListener<ApplicationReadyEvent> {

	@Autowired
	UserRepository userRepo;
	
	/*@Override
	public void run(ApplicationArguments arg0) throws Exception {
		userRepo.save(new User("Kamal", 36, "IT"));
	}*/

	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		System.out.println("Loading startup data.........");
		userRepo.save(new User("Kamal", 36, "IT"));
	}
}
