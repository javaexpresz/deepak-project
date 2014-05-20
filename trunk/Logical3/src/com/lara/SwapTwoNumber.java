package com.lara;

public class SwapTwoNumber
{
	public static void main(String[] args)
	{
		int m=3,n=4;
		System.out.println("before swap:m and n:"+m+","+n);
		m = m+n;
		n = m-n;
		m = m-n;
		System.out.println("after swap m and n is:"+m+","+n);
		
	}
}
