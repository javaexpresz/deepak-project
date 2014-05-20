package com.lara;

public class Prog
{
	public static void main(String[] args)
	{
		//find number of argument
		int n = args.length;
		System.out.println("number of arguments=" + n);
		
		//display all the argument
		for(int i = 0; i<n; i++)
		{
			System.out.println(args[i]);
		}
	}
}
