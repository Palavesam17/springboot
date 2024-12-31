package com.example.Twotable.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.Twotable.dao.UserResp;
import com.example.Twotable.model.User;

@Service
public class UserService {
	
	@Autowired
	UserResp a;
	
	public User save(User U) {
		return a.save(U);
	}
	

}
