package com.sriindu.java.Bank;

// Custom exception class
public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message); // Pass the message to the Exception class
    }
}