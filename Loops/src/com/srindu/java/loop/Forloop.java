package com.srindu.java.loop;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i=1;i<=4;i++) {
//			System.out.println("****");
//		}
		
//		reverse of number
		int n=1068;
		
//		while(n>0) {
//			int rem=n%10;
//			System.out.print(rem);
//			n=n/10;
//			
//		}
		
//		rev=rev*10+lastDigit
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			
		}
		System.out.print(rev);
			
	}

}
