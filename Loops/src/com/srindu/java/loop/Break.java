package com.srindu.java.loop;
import java.util.*;
public class Break {
  public static void main(String args[]) {
	  Scanner sc= new Scanner(System.in);
	  System.out.print("Enter num");
	  int n=sc.nextInt();
	  
	  for (int i=0;i<=n;i++) {
		  if (i%10==0) {
			  continue;
		  }
		  System.out.println(i);
	  }
	  
//	  do {
//		  int n=sc.nextInt();
//		  if (n%10==0) {
//			  break;
//		  }
//		  System.out.println(n);
//		  
//	  }while(true)

	 
  }
}
