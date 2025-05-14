package com.sriindu.java.generics;

public class Sender<T>{

	private T message;//T--> the data  type 
	
	public void  setmessage(T message) {
		this.message=message;
		
	}
	
	public T getmessage() {
		return message;
	}
}
