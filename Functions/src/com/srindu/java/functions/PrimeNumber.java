package com.srindu.java.functions;
import java.util.*;
public class PrimeNumber {
	public static boolean isPrime(int n ) {
		//boolean isPrime=true;
		for (int i=2;i<=Math.sqrt(n);i++) {
			if (n % i ==0) {
				return false;
			}
		}
		return true;
	}
	
	
//	Printing Range of Prime number
	
	public static void PrimeRange(int n) {
		for (int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
//			
		}
		
	}
	
	public static void main(String[] args) {
		PrimeRange(20);
//		System.out.println();

	}

}
