package com.srindu.java.loop;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean Isprime=true;
		if (n==2) {
			System.out.print("Prime number");
			
		}
		
		for (int i=2;i<=Math.sqrt(n);i++) {
			System.out.print(i);
			if (n%i==0) {
				Isprime=false;
			}
		}
		
		if (Isprime == true) {
			System.out.print("N is prime");
		} else {
			System.out.print("N is not  a prime");
		}
	}

}
