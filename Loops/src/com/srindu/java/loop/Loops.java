package com.srindu.java.loop;
import java.util.*;
public class Loops {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
			
	}

}
