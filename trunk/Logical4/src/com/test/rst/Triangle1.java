package com.test.rst;

public class Triangle1
{
	public static void main(String[] args)
	{
		int n = 5;
		for(int i = 0;i<n;i++)
		{
			for(int j = n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k = i; k>=0; k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
