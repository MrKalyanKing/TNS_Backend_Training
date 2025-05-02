package com.sriindu.java.oopss;
  
class Students{
	String name;
	int roll;
	String password;
	int marks[]=new int[3];
	
	Students(Students s1){
		this.name=s1.name;
		this.roll=s1.roll;
		this.marks=s1.marks;
	}
	Students(){
		System.out.println("Constructor is called>>");
	}
	Students(String name){
		this.name=name;
	}
	Students(int roll){
		this.roll=roll;
		
	}
	
	
}
public class CopyConstructor {

	public static void main(String[] args) {
		
		Students s1=new Students();
		s1.name="kalyan";
		s1.roll=12;
		s1.password="123@#";
		s1.marks[0]=94;
		s1.marks[1]=70;
		s1.marks[2]=95;
		Students s2=new Students(s1);
		s2.marks[2]=100;
		for (int i=0;i<3;i++) {
			System.out.println(s2.marks[i]);
		}
	}

}
