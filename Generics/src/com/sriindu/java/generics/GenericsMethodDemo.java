package com.sriindu.java.generics;
import java.util.*;
public class GenericsMethodDemo {
 
	public static<T> void displayArray(T[] array) {
		Scanner sc=new Scanner(System.in);
		
		for(T i:array) {
			System.out.println("ARRAY ELEMENTS"+i);
		}
	}
}
