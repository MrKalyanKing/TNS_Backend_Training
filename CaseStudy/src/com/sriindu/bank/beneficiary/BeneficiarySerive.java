package com.sriindu.bank.beneficiary;

import java.util.ArrayList;
import java.util.List;

public class BeneficiarySerive implements BeneficiaryOperation{
  List <Beneficiary> beneficiary=new ArrayList<>();
	
	public void addBeneficiary(Beneficiary beneficiarys) {
		 beneficiary.add(beneficiarys);
		
	}

	
	public void displayBeneficiary() {
		if( beneficiary.isEmpty()) {
			System.out.println("No Beneficiary added\n");
			
		}
		else {
			for (Beneficiary bcc: beneficiary) {
				System.out.println(bcc);
			}
		}
		
		
	}

	
	


	
	public void getBeneficiaryByCustomerID(int customerID) {
		System.out.println("\n=== Beneficiary for Customer ID: " + customerID + "");
        boolean found=false;
        for (Beneficiary bcc: beneficiary) {
        	if(bcc.getCustomerID() == customerID) {
        		System.out.println(bcc);
        		found=true;
        	}
        }
        if(!found) {
			System.out.println("No Beneficiary found for Customer ID: " + customerID);
		}
		
	}
	
	

}
