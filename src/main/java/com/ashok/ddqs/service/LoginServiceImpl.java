package com.ashok.ddqs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashok.ddqs.dao.LoginDao;
import com.ashok.ddqs.model.User;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public void createUser(User user) {

		loginDao.save(user);
		
	}
	
	@Override
	public Iterable<User> findAll() {
		
		return loginDao.findAll();
	}
	
	
	

}
