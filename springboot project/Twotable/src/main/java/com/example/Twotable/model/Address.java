package com.example.Twotable.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;
	private String street;
	
	   public Address() {
	    }

	    public Address(int aid,String street) {
	    	this.aid=aid;
	        this.street = street;
	        
	    }

    public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
