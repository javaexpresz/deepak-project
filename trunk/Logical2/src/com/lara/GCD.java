package com.lara;

public class GCD
{
	public static void main(String[] args)
	{
		System.out.println(getGCD(125, 150));
	}
	public static int getGCD(int a, int b)
	{
		
		while(a != 0 && b != 0)
		{
			if(a>=b)
			{
				a = a-b;
			}
			else
				b = b-a;
		}
		if(a == 0)
		{
			//System.out.println("if");
			return b;
		}
			
		else
		{
		//	System.out.println("else");
			return a;
		}
	}
}