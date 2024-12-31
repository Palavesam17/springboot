package com.example.Twotable.model;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aid")
    private Address address;
	
	public User() {
		
	}
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
