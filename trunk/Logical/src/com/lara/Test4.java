package com.lara;

public class Test4
{
	public static void main(String[] args)
	{
		try
		{
			int i=1/0;
			return;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("catch");
		//	return;
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("di");
	}
}
