package com.example.Twotable.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.Twotable.model.User;

@Repository
public interface UserResp extends JpaRepository<User,Integer> {

}
