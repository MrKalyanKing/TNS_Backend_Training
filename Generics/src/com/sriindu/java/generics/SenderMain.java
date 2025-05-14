package com.sriindu.java.generics;

public class SenderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender<String> ob=new Sender<String>();
		ob.setmessage("Hello welocme to generics");
		
		System.out.println(ob.getmessage());

	}

}
