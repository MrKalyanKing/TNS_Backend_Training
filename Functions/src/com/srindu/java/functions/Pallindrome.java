package com.srindu.java.functions;

public class Pallindrome {
	 public static boolean isPallindrome (int n) {
		 int mynum=n;
		 int rev=0;
		 while (n >0) {
			 int rem= n%10;
			 rev=(rev *10) +rem;
			 n=n/10;
		 }
		 System.out.println(rev);
		 System.out.println(mynum);
		 if (mynum == rev) {
			 return true;
		 }
		return false;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPallindrome(121));
	}

}
