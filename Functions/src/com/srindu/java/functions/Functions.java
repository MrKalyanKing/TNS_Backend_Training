package com.srindu.java.functions;

public class Functions {
	public static int factorial(int n) {
		int fact=1;
		for (int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
				
	}
	public static int BinomialCoef(int n,int r) {
		int fact_n=factorial(n);
		int fact_r=factorial(r);
		int fact_nmr=factorial(n-r);
		int bin_coef=fact_n/(fact_r*fact_nmr);
		return bin_coef;
		
	}

	public static void main(String[] args) {
		
			// in java the shoukd always  calls by call by value method
//		 Binomial Coefficient ncr=n!/r! (n-r)!
		System.out.print(BinomialCoef(5,2));
	}

}
