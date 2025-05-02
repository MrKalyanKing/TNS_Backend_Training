package com.sriindu.java.oopss;

class Studentss{
	String name;
	int roll;
	String password;
	int marks[]=new int[3];
	
	
	//shallow copy
//	Studentss(Studentss s1){
//		this.name=s1.name;
//		this.roll=s1.roll;
//		this.marks=s1.marks;
//	}
//	
	Studentss(Studentss s1){
//		this.marks=new int [3];
		this.name=s1.name;
		this.roll=s1.roll;
		this.marks=s1.marks.clone();
//		 for(int i=0;i<3;i++) {
//			 this.marks[i]=s1.marks[i];
//		 }
	}
	
	Studentss(){
		System.out.println("Constructor is called>>");
	}
//	
//	
	
}
public class ShallowandDeepCopy {

	public static void main(String[] args) {
		
		Studentss s1=new Studentss();
		s1.name="kalyan";
		s1.roll=12;
		s1.password="123@#";
		s1.marks[0]=94;
		s1.marks[1]=70;
		s1.marks[2]=95;
		Studentss s2=new Studentss(s1);
		s2.marks[2]=100;
		
		for (int i=0;i<3;i++) {
			System.out.println(s2.marks[i]);
		}
	}

}
