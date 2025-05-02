package com.sriindu.java.oopss;

class Pen{
	private String color;
	private int tip;
	String getColor() {
		return this.color;
	}
	int getTip() {
		return this.tip;
	}
	 void setColor(String newColor) {
		 this.color=newColor;
	}
	  void setTip(int tip) {
		 this.tip=tip;
	 }
}



public class GettersSetters {

	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.setColor("blue");
		System.out.println(p1.getColor());
		p1.setTip(12);
		System.out.println(p1.getTip());
	}

}
