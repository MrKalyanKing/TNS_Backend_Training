 package com.sriindu.java.arrays;

public class MaxSubArray {
	
	public static void MaxSubArray(int num[]) {
		int currsum=0;
		int maxsum=Integer.MIN_VALUE;
		for (int i=0;i<num.length;i++) {
			int st=i;
			for (int j=0;j<num.length;j++) {
				int end=j;
				currsum=0;
				for (int k=st;k<=end;k++) {
					currsum+=num[k];
				}
				if (maxsum < currsum) {
					maxsum=currsum;
				}
						
			}
		}
		System.out.println(maxsum);
	}

	public static void main(String[] args) {
		int num[]= {2,3,4,-5,6};
		MaxSubArray(num);
		

	}
 
}
