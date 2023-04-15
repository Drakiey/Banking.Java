/*Drake Goodrich
 * File: (BankApplication.java) - Assignment 3
 * This class is the main class. It Validates user inputs using while
 * loops, and uses a "Switch" that acts like an if statement, but it's much simpler and less complex.
 * https://stackoverflow.com/questions/20681616/java-creating-a-menu-loop 
 * ^ Where I learned it.
 */



import java.util.Scanner;

public class BankApplication {
	
	public static void main(String[] args) {
		

		
		int menuOptions = 0;
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("MidFirst Banking App");
		System.out.println("Enter the unique ID: ");
		String uniqueID = sc.nextLine();
		while(uniqueID.length() < 4)
		{
			System.out.println("!!!ERROR: unique IDs are at least 4 characters long!!!");
			System.out.println("Enter the unique ID: ");
			uniqueID = sc.nextLine();
		}
		
		System.out.println("Enter the initial balance: ");
		double acctBalance = sc.nextDouble();
		while(acctBalance < 500)
		{
			System.out.println("!!!ERROR: new accounts need at least $500!!!");
			System.out.println("Enter the initial balance: ");
			 acctBalance = sc.nextDouble();
		}
		
		System.out.println("Enter the annual interest rate as a percentage %");
		double annualInterestRate = sc.nextDouble();
		
		CheckingAccount info=new CheckingAccount(uniqueID,acctBalance);
		info.setAnnualInterestRate(annualInterestRate);
		do {
			System.out.println("==============================");
			System.out.println("=       OPTIONS BELOW        =");
			System.out.println("==============================");
			System.out.println("1. Deposit");
			System.out.println("2. View Daily Interest Rate");
			System.out.println("3. View Account Details");
			System.out.println("4. Exit");
			System.out.println("Enter your selection");
			menuOptions = sc.nextInt();
			switch(menuOptions) //instead of long if  statements for all inputs
			{
			default: // acts as an else 
			System.out.println("IInvalid Selection - TRY AGAIN!");
			
			case 1: 
			System.out.println("Enter your deposit amount");
			double deposit = sc.nextDouble();
			while (deposit < 0)
			{
				System.out.println("!!!ERROR: deposits must be greater than $0!!!");
				System.out.println("Enter your deposit amount");
				deposit = sc.nextDouble();
			}
			info.depositCash(deposit);
			System.out.println("New Balance:  $" +info.getAcctBalance());	
			break;
				
			case 2: 
			System.out.println("Your daily Interest Amount is % ");
			System.out.println(info.getDailyIntRate());
			break;
			
			case 3:
			System.out.println("Account unique ID: " + uniqueID);
			System.out.println(info);
			break;
				
			case 4:
			System.out.println("Program exiting...");
			break;
			}
		} while(menuOptions!=4); 
	}
}
