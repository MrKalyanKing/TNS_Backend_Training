package com.sriindu.java.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//predefeined functional interface

public class LamdaCollecction {

	public static void main(String[] args) {
//		List<String> l=new ArrayList<String>();
		List<String> l= Arrays.asList("Kalyan","Dev","Vijaya");
		
		//sorting using lamda exp
		l.sort((a,b)->a.compareTo(b));
		
		//for(String s:l)
		l.forEach(names->System.out.println(names));

	}

}
