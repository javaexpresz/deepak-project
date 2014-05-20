package com.lara;

import java.util.Scanner;

public class FloyedTriangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any digit");
		int k = 0;
		int n = sc.nextInt();
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print(k);
			//	System.out.print(i);
				k++;
			}
			System.out.println();
		}
	}
}
