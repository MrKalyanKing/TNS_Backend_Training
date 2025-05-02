package com.srindu.java.loop;
import java.util.*;
public class SumOfInt {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int evensum=0;
		int oddsum=0;
		for (int i=0;i<=n;i++) {
			if (i%2==0) {
				evensum+=i;
			}
			else {
				oddsum+=i;
			}
		}
		
		System.out.println(evensum+","+oddsum);

	}

}
