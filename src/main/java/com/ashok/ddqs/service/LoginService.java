package com.ashok.ddqs.service;

import org.springframework.stereotype.Service;

import com.ashok.ddqs.model.User;

@Service
public interface LoginService {
	
	
	public void createUser(User user);
	
	public Iterable<User> findAll();

}
