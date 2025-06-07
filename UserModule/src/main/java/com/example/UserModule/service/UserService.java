package com.example.UserModule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserModule.entity.User;
import com.example.UserModule.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo urepo;
	
	//inserting the data into database
	public User addUser(User user) {
		return urepo.save(user);
	}
	
	//get user data
	
	public List<User> getuser(){
		return urepo.findAll();
		
	}
	
	//update user data 
	public User updateUser(User user) {
		
		long id=user.getId();
		User user1=urepo.findById(id).get();
		 user1.setName(user.getName());
		 user1.setType(user.getType());
		 user1.setPassword(user.getPassword());
		 
		 return urepo.save(user1);
	}
	
	//delete
	 
	 public void deleteUser(long id) {
		 urepo.deleteById((long) id);
	 }

}
