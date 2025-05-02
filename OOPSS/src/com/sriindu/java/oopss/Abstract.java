package com.sriindu.java.oopss;


abstract class Animal{
	String color;
	
	Animal(){
		color="brown";
		System.out.println("Animal constructor called, color set to: " + color);
	}
	void eat() {
		System.out.print("Anything eat");
	}
	abstract void walk();
}

class Horse extends Animal{
	
	Horse(){
		color="dARKbrown";
		System.out.println("Animal constructor called, color set to: Horse"+ color);
	}
	
	void walk() {
		System.out.println("HAving 4 legs");
	}
}
class Chicken extends Animal{
	String changeColor() {
		color="white";
		return color;
	}
	void walk() {
		System.out.println("Having 2 legs");
	}
}

class mustang extends Horse{
	mustang(){
		System.out.println("Animal constructor called, color set to:Mustang " );
	}
}

public class Abstract {
	
	public static void main(String[] args) {
		
		mustang m=new mustang();
		
		
		
		
	}

}
