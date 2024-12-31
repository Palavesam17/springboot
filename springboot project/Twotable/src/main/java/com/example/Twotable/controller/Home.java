package com.example.Twotable.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Twotable.model.Address;
import com.example.Twotable.model.User;
import com.example.Twotable.service.AddressService;
import com.example.Twotable.service.UserService;

@Controller
public class Home {
	
	@Autowired
	UserService ob;
	
	@Autowired
	AddressService ob1;
	
	@RequestMapping("home")    
	public String get()  
	{     
	return "index";    
	}    
	

	
	@RequestMapping("add")    
	public String get11 ()  
	{     
	return "Address";    
	}  

	 @PostMapping("abc")
	    public String get21(@ModelAttribute User s1) {
	        ob.save(s1);
	        return "Address";
	    }
	

	 @PostMapping("add")
	    public String get31(@ModelAttribute Address s2) {
	        ob1.save1(s2);
	        
	        return "Success";
	    }
	
  }
	


