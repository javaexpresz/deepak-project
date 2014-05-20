package com.lara;

public class Biggest
{
	public static void main(String[] args)
	{
		int [] a = {2,54,67,43,33,56};
		System.out.println(findLargest(a));
	}
	public static int findLargest(int a[])
	{
		int smallest = a[0];
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]<smallest)
			{
				smallest = a[i];
			}
		}
		return smallest;
	}
}