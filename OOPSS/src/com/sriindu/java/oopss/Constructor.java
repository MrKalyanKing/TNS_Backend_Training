package com.sriindu.java.oopss;

class Student{
	String name;
	int roll;
	Student(){
		System.out.println("Constructor is called>>");
	}
	Student(String name){
		this.name=name;
	}
	Student(int roll){
		this.roll=roll;
		
	}
}
public class Constructor {

	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("Kalyan");
		Student s3=new Student(12);
//		System.out.println(s1);
		System.out.println(s2.name);
		System.out.println(s3.roll);

	}

}
