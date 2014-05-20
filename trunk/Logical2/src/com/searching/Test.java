package com.searching;

public class Test
{
	public static void main(String[] args)
	{
		int a[] = {14,56,43,88,11,35};
		int largest = a[0];
		for(int b: a)
		{
			if(b > largest)
			{
				largest = b;
			}
		}
		System.out.println(largest);
	}
}
