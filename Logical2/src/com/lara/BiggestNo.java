package com.lara;

public class BiggestNo
{
	public static void main(String[] args)
	{
		int []a = {1,4,22,67,54};
		int largest = a[0];
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]>largest)
				largest = a[i];
		}
		System.out.println("largest number is:********>" + largest);
	}
}
