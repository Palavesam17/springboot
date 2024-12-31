package com.example.Twotable.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.Twotable.model.Address;

@Repository
public interface AddressResp extends JpaRepository<Address,Integer>{

}
