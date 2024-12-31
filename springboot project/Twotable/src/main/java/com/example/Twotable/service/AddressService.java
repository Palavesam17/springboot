package com.example.Twotable.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.Twotable.dao.AddressResp;
import com.example.Twotable.model.Address;



@Service
public class AddressService {
	
	@Autowired
	AddressResp b1;
	
	public Address save1(Address A) {
		return b1.save(A);
	}
	
	
	


}
