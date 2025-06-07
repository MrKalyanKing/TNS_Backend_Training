package com.example.CollegeModule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CollegeModule.entity.College;
import com.example.CollegeModule.repository.CollegeRepository;

@Service
public class CollegeService {

	
	@Autowired
	public CollegeRepository crepo;
	
	//inserting data into database
	
	public College addCollege(College college) {
		return crepo.save(college);
	}
	
	//getting the data
	public List<College> getCollege(){
		return crepo.findAll();
	}
	
	//update user
	
	public College updateUser(College user) {
		
		long id=user.getId();
		College clg1=crepo.findById(id).get();
		clg1.setId(user.getId());
		clg1.setCollegeAdmin(user.getCollegeAdmin());
		clg1.setCollegeName(user.getCollegeName());
		clg1.setLocation(user.getLocation());	
		return crepo.save(clg1);
	}
	
	//deletecollegedetails
	public void deleteCollege(long id) {
		crepo.deleteById(id);
		
	}


}
