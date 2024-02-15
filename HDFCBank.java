package com.Bank;
import java.util.Scanner;
public class HDFCBank{
	static String account_holder_Name="Sai Krishna";
	static int mpin=3026;
	static long MbNumber=9951896473L;
	static {
		System.out.println("Welcome to HDFC Bank");
	}
	{
		System.out.println("OTP's are for your account security... So don't share your OTP with anyone");
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your account holder name");
		String name=sc.nextLine();
		System.out.println("enter the four digit pin number");
		int pinnum=sc.nextInt();
		if(mpin==pinnum && account_holder_Name.equals(name))
		{
			System.out.println("enter your mobile number");
			Long mbno=sc.nextLong();
			if(mbno==MbNumber)
			{
				int otp=OTPGenerate.otp();
				System.out.println("OTP:"+otp);
				System.out.println("enter the otp");
				int extotp=sc.nextInt();
				if(otp==extotp)
				{
					System.out.println("Choose the Account type");
					System.out.println("1.Saving Account");
					System.out.println("2.Loan Account");
					int accountType=sc.nextInt();
					switch(accountType) {
					case 1:{
						Savingsaccount s = new Savingsaccount();
						System.out.println("Choose the option");
						System.out.println("1.Withdraw");
						System.out.println("2.Deposit");
						System.out.println("BalanceEnquiry");
						int option = sc.nextInt();
						//Savings account
						switch(option) {
						case 1:{
							System.out.println("enter the amount");
							double amount=sc.nextDouble();
							s.withdraw(amount);
						}break;
						case 2:{
							System.out.println("enter the amount");
							double amount=sc.nextDouble();
							s.deposit(amount);
						}break;
						case 3:{
							s.balanceEnquiry();
						}break;
						default:System.out.println("You have entered incorrect option please check");
						}
					}
					case 2:{
							LoanAcount L = new LoanAcount();
							System.out.println("Choose the option");
							System.out.println("1.Withdraw");
							System.out.println("2.Deposit");
							System.out.println("3.balanceEnquiry");
							int option=sc.nextInt();
							//LoanAccount
							switch(option) {
							case 1:{
								System.out.println("enter the amount");
								double amount=sc.nextDouble();
								L.withdraw(amount);
							}break;
							case 2:{
								System.out.println("enter the amount");
								double amount = sc.nextDouble();
								L.deposit(amount);
							}break;
							case 3:{
								L.balanceEnquiry();
							}break;
							default:System.out.println("You have entered wrong option.. please check");
							}
							}
						}
					}else {
						System.err.println("Dear HDFC Bank user please check your accountType and enter");
					}
				}else {
					System.err.println("Invalid OTP... Please enter the correct otp");
				}
			}else {
				System.err.println("Invalid Pin Number/AccountHolderName");
			}
		sc.close();
		}
	}
					
				
			
	
