package com.Bank;

public class Savingsaccount implements Account {
	static final long account_Number=98765432121L;
	double TotalBalance=2000.00;
	//@override
	public void balanceEnquiry()
	{
		System.out.println("TotalBalance:"+TotalBalance);
	}
	//@override
	public void balanceDisplay(double amount,String action)
	{
		System.out.println("Dear HDFC bank user rupees"+amount+"is"+action+"and the account number"+account_Number+"on 06-02-2024"+"Available balance:"+TotalBalance);
	}
	//@override
	public void withdraw(double amount)
	{
		String action="DEBITED";
		if(TotalBalance>=amount)
		{
			TotalBalance=TotalBalance-amount;
			balanceDisplay(amount,action);
		}else {
			System.err.println("Insufficient Funds");
		}
	}
	//@override
	public void deposit(double amount)
	{
		String action="CREDITED";
		if(amount<10000)
		{
			TotalBalance=TotalBalance+amount;
			balanceDisplay(amount,action);
		}else {
			System.err.println("You have exceeding the maximum limit"+"so try pay lesser than 10000");
		}
	}
}
