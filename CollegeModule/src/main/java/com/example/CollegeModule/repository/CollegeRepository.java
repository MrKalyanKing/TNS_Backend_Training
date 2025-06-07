package com.example.CollegeModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CollegeModule.entity.College;

public interface CollegeRepository extends JpaRepository<College,Long>{

}
