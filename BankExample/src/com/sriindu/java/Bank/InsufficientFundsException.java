package com.sriindu.java.Bank;
//custom exception
public class InsufficientFundsException extends Exception{

  public InsufficientFundsException(String message) {
	  super(message);
  }
}
