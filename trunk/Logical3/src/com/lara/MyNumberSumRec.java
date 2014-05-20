package com.lara;

public class MyNumberSumRec
{
	int sum = 0;
	public int getNumberSum(int number)
	{
		
		if(number==0)
		{
			return sum;
		}
		else
		{
			sum = sum+(number%10);
			getNumberSum(number/10);
		}
		return sum;
	}
	public static void main(String[] args)
	{
		MyNumberSumRec mnr = new MyNumberSumRec();
		System.out.println(mnr.getNumberSum(1234));
	}
}
