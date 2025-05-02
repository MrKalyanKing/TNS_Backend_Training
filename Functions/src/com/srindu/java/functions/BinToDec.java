package com.srindu.java.functions;

public class BinToDec {

	 public static void BinToDec(int binnum) {
		 int mynum=binnum;
		 int pow=0;
		 int DecNum=0;
		 while(binnum > 0) {
			 int lastDigit= binnum%10;
			 DecNum=DecNum +(lastDigit *(int) Math.pow(2, pow));
			 pow++;
			 binnum=binnum/10;
			 
		 }
		 System.out.println("Decimal of" + mynum +" =" + DecNum);
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinToDec(110);

	}

}
