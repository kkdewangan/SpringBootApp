package com.kamald.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamald.dao.UserRepository;
import com.kamald.model.User;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	public List<User> getAllUsers() {
		return (List<User>) repo.findAll();
	}
	
	/*@PostConstruct
	public void loadUsers() {
		repo.save(new User("Kamal", 36, "IT"));
	}*/
}
