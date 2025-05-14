package com.sriindu.java.lamda;

import java.util.function.Predicate;

// predefined functional interface

public class PredicateDemo {

	public static void main(String[] args) {
		// test is the abstract method of predicate
		Predicate<String> p=str->str.length()>5;
		System.out.println(p.test("kalyan"));
		System.out.println(p.test("TNSIF"));
		
	  
	}

}
