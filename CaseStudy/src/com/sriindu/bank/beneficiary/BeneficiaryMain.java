package com.sriindu.bank.beneficiary;

import java.util.Scanner;

public class BeneficiaryMain {

	BeneficiarySerive beneficiarySerivce=new BeneficiarySerive();
	Scanner scanner=new Scanner(System.in);
	public void manageBeneficiary() {
		Beneficiary beneficiary=new Beneficiary(1001,1,"Kalyan","6722212","SBI");
		beneficiarySerivce.addBeneficiary(beneficiary);
		beneficiarySerivce.displayBeneficiary();
	}
	
	public void fetchBeneficiaryById(Scanner scanner) {
		int customerID=scanner.nextInt();
		beneficiarySerivce.getBeneficiaryByCustomerID(customerID);
		
	}
	
}
