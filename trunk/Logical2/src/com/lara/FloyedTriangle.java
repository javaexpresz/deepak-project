package com.lara;

import java.util.Scanner;

public class FloyedTriangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int k= 0;
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=i; j++)
			{
			//	k++;
				System.out.print(i);
			}
		//	System.out.print(",");
			System.out.println();
		}
	}
}
