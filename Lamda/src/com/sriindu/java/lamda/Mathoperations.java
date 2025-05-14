package com.sriindu.java.lamda;


// Demo for user defined functional interface
@FunctionalInterface
interface Calculations {
	
	int cal(int a,int b);
	
}

public class Mathoperations {
	
	public static void main(String[] args) {
//		(parameter)->{stmt};
		Calculations add=(a,b)-> a+b;
		
		Calculations mul=(a,b)-> a*b;
		System.out.println(add.cal(10,05));
		System.out.println(mul.cal(2, 4));
	}

}
