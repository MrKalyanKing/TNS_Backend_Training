package com.example.UserModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserModule.entity.User;



public interface UserRepo extends JpaRepository<User,Long> {

}
