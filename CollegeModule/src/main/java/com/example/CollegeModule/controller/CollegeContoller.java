package com.example.CollegeModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CollegeModule.entity.College;
import com.example.CollegeModule.service.CollegeService;

@RestController
public class CollegeContoller {
	
	@Autowired
	public CollegeService cserv;
	
	@PostMapping("/addcollege")
	public College addcollege(@RequestBody College college) {
		return cserv.addCollege(college);
	}
	@GetMapping("/getcollege")
	public List<College> getCollege(){
		return cserv.getCollege();
	}
	
	@PutMapping("/updatecollege")
	public College updateCollege(@RequestBody College college) {
		return cserv.updateUser(college);
	}
	
	@DeleteMapping("/deletecollege/{id}")
	public void deleteCollege(@PathVariable long id) {
		cserv.deleteCollege(id);
	}
	
	
}
