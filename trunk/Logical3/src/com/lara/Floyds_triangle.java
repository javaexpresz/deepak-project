package com.lara;

public class Floyds_triangle
{
	public static void main(String[] args)
	{
		int k = 0;
		for(int i = 1; i<=4; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				k++;
				
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
