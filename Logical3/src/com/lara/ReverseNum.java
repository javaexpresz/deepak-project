package com.lara;

public class ReverseNum
{
	public int Reversenum(int number)
	{
		int reverse = 0;
		while(number !=0)
		{
			reverse = (reverse*10) + (number%10);
			number = number/10;
		}
		return reverse;
	}
	public static void main(String[] args)
	{
		ReverseNum rn= new ReverseNum();
		System.out.println(rn.Reversenum(12345));
	}
}
