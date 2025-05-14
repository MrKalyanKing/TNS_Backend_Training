package com.sriindu.java.generics;

public class GenericsMethodMain {

	public static void main(String[] args) {
	  
		Integer[] intarray= {1,2,3,4};
		String[] stringarray= {"Kalyan","sai","Dev","Vijaya"};
		//calling the method
		GenericsMethodDemo.displayArray(intarray);
		
		GenericsMethodDemo.displayArray(stringarray);
		
		//generic is applied to class mean that object
		//to give datatype to object using generic 
	}

}
