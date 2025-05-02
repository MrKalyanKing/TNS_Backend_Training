package com.srindu.java.functions;

public class OverridingDataTypes {

	public static int sum(int a,int b) {
		return a+b;
	}
	public static float sum(float a,float b) {
		return a+b;
	}
	public static void main(String args[]) {
		System.out.println(sum(2,3));
		System.out.println(sum(2.3f,3.3f));
	}
}
