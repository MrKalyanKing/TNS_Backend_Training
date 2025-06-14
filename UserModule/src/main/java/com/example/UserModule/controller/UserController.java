package com.example.UserModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserModule.entity.User;
import com.example.UserModule.service.UserService;

@RestController
public class UserController {

	@Autowired
	public UserService userv;
	
	@PostMapping("/adduser")
	public User regUser(@RequestBody User user) {
		return userv.addUser(user);
	}
	
	@GetMapping("/getuser")
	public List<User> getuser(){
		return userv.getuser();
	}
	
	@PutMapping("/updateuser")
	public User upadateuser(@RequestBody User user) {
		return userv.updateUser(user);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	
	public  void deleteUser(@PathVariable long id) {
		userv.deleteUser(id);
	}
	
}
