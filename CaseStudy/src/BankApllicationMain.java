import java.util.Scanner;

import com.sriindu.bank.beneficiary.BeneficiaryMain;
import com.sriindu.bank.transaction.TransactionMain;
import com.srrindu.bank.account.AccountMain;
import com.srrindu.bank.cutomer.Customer;
import com.srrindu.bank.cutomer.CustomerMain;
import com.srrindu.bank.cutomer.CustomerService;

public class BankApllicationMain {

	public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
	    
	  CustomerMain customer=new CustomerMain();
	  AccountMain accounts=new AccountMain();
	  BeneficiaryMain beneficiaryss=new BeneficiaryMain();
	  TransactionMain transactionss=new TransactionMain();
	    
	   
	    while (true) {
            System.out.println("\n=== Bank Application ===");
            System.out.println("1. Add Customers");
            System.out.println("2. Add Accounts");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find By CustomerID");
            System.out.println("6. List all Accounts of specific Customer");
            System.out.println("7. List all Transaction of specific Account");
            System.out.println("8. List all  Beneficiaries of specific customer");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            
            switch(choice) {
            case 1:
            	customer.manageCustomer();
            	break;
            case 2:
            	accounts.manageAccounts();
            	break;
            case 3:
            	beneficiaryss.manageBeneficiary();
            	break;
            case 4:
            	transactionss.manageTransaction();
            	break;
            case 5:
            	customer.fetchCustomerById(scanner);
            	break;
            case 6:
            	System.out.println("Enter the CustomerID\n");
            	accounts.fetchCustomerById(scanner);
            	break;
            case 7:
            	System.out.println("Enter the AccountID\n");
            	transactionss.fetchTransactionByAccountId(scanner);
            	break;
            case 8:
            	System.out.println("Enter the CustomerID\n");
            	beneficiaryss.fetchBeneficiaryById(scanner);
            	break;
            case 9:
            	System.out.println("Thank you for using Bank Application");
            	scanner.close();
            	System.exit(0);
            	break;
            }
           
            	
	    }



	}

}
