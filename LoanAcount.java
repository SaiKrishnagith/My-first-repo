package com.Bank;

public class LoanAcount implements Account {
	static final long account_number=12345678919L;
	double totalBalance=100000;
	double target=500000;
	//@override
	public void balanceEnquiry()
	{
		System.out.println("Total Balance:"+totalBalance);
	}
	//@override
	public void balanceDisplay(double amount,String action)
	{
		System.out.println("Dear HDFC bank user rupees"+amount+"is"+action+"and the account number"+account_number+"on 06-02-2024, "+"Total Balance:"+totalBalance);
	}
	//@override
	public void withdraw(double amount)
	{
		String action="CREDITED";
		if( amount<=totalBalance)
		{
			totalBalance=totalBalance-amount;
			balanceDisplay(amount,action);
		}else {
			System.err.println("Dear user your limit is exceeding"+"as your requesting"+amount+"because your loan is already"+totalBalance+"and remaining loan amount is"+(target-totalBalance));		}
	}
	//@override
	public void deposit(double amount)
	{
		String action="DEBITED";
		if(totalBalance+amount<=target)
		{
			totalBalance=totalBalance+amount;
			balanceDisplay(amount,action);
		}else {
			System.err.println("Dear user cross check TotalBalance and Pay");
		}
	}
}
