package com.lara;

public class A
{
	static void fun(int n)
	{
		if(n>0)
		{
			fun(--n);
			System.out.println(n);
			fun(--n);
		}
	}
	public static void main(String[] args)
	{
		int num=3;
		fun(num);
		
	}
}