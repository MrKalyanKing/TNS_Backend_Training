package com.srindu.java.functions;

public class FunctionOveriding {

	public static int sum(int a ,int b) {
		return a+b;
	}
	
	public static int sum(int a ,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		FunctionOveriding obj=new FunctionOveriding();
		System.out.println(obj.sum(2,3));
		System.out.println(obj.sum(2,3,5));
	}

}
