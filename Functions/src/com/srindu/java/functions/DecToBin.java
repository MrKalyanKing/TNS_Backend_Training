package com.srindu.java.functions;

public class DecToBin {
	public static void DectoBIn(int Dec) {
		int mynum=Dec;
		int pow=0;
		int binNum=0;
		while (Dec > 0) {
			int rem= Dec % 2;
			binNum=binNum +(rem * (int) Math.pow(10,pow));
			pow++;
			Dec=Dec /2;
		}
		System.out.println("Decimal Number"+" "+mynum + "="+binNum);
	}
 public static void main(String args[]) {
	 DectoBIn(6);
	 
 }
}
 