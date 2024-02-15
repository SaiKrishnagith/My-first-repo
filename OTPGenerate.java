package com.Bank;
import java.util.Random;
public class OTPGenerate {
	public static int otp()
	{
		String str="0123456789";
		int length=4;
		char otp1[]=new char[length];
		Random random = new Random();
		for(int i=0;i<otp1.length;i++)
		{
			int index=random.nextInt(str.length());
			otp1[i]=str.charAt(index);
		}
		String s=new String(otp1);
		int finalOTP=Integer.parseInt(s);
		return finalOTP;
	}
	public static void main(String[] args)
	{
		System.out.println(otp());
	}
}
