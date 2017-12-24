package com.kamald.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.kamald.model.User;

public interface UserRepository extends CrudRepository<User, Serializable>{

}
