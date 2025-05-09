package com.sriindu.java.Bank;

public interface BankImplement {
   double WITHDRAW_AMT=50000;
   double DEPOSIT_AMT=60000;
  
   
   void deposit(double amt) throws InvalidAmountException;
   void withdraw(double amt) throws InsufficientFundsException;
}
