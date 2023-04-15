/*Drake Goodrich
 * File: (CheckingAccount.java) - Assignment 3
 * This 1/2 java classes separates variables and other important code that
 * cannot be manipulated by the user input. There are // throughout the
 * code to describe what exactly is everything, and I sort of wanted to keep
 *  it to reuse some code and  refer back to it in later assignments
 */ 


import java.util.Date; // for the current date of user running 

public class CheckingAccount {
	
	private String uniqueID; 
	private double acctBalance; 
	private double annualInterestRate; 
	private Date dateCreated; 
	
	
	public CheckingAccount(String UniqueID,double acctBalance)
	{
		// constructor that includes unique id and initial balance
		this.uniqueID = uniqueID;
		this.acctBalance = acctBalance;
		this.annualInterestRate= annualInterestRate;
		dateCreated=new Date();
	}
	// Getter and Setters line 28-52
	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	
	public double getAcctBalance() {
		return acctBalance;
	}
	
	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	// End of Getter and Setters^

	// Single Getter for Date
	public Date getDateCreated() {
		return dateCreated;
	}
	// depositCash Method
	public void depositCash(double deposit) {
	this.acctBalance+=deposit;
	}
	// getDailyIntRate Method
	public double getDailyIntRate() {
		return this.acctBalance*((annualInterestRate/365/100)); 
	}
	//ToString 
	@Override
	public String toString() {
		return " Account Balance " + getAcctBalance() + ", Daily interest rate: $"
				+ getDailyIntRate() + " Valued member since: " + getDateCreated()+  "]";
	}
	
	
	

	
	

	

}
