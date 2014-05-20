package com.test;

public class Triangle
{
	public static void main(String[] args)
	{
		int n=10;
		for(int i = 0; i<n; i++)
		{
			for(int j = n; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k = i; k>0;  k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i = 0; i<n; i++)
		{
			for(int j = i; j<n; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
			for(int k = i; k>=0; k--)
			{
				System.out.print(" ");
			}	
		}
	}
}
