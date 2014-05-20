package com.lara;

public class Test7
{
 static	int zap(int num)
	{
		if(num<=1)
		{
			return 1;
		}
		else
		{
			return zap(num-3)+zap(num-1);
		}
	}
	public static void main(String[] args)
	{
		int number=6, result;
		System.out.println("enter number" + number);
		result = zap(number);
		System.out.println("result= " + result);
	}
}
