package com.sriindu.java.arrays;

public class PrintSubArrray {
	public static void Printsubarray(int num[]) {
		
		for (int i=0;i<num.length;i++) {
			int st=i;
			for (int j=0;j<num.length;j++) {
				int end=j;
				
				for (int k=st;k<=end;k++) {
					
					System.out.print(num[k]+ " " );
				}
				System.out.println();			
				}
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		
		int num[]= {2,4,6,8,9};
		Printsubarray(num);
	}

}
