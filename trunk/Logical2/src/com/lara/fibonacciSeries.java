package com.lara;

import java.util.Scanner;

public class fibonacciSeries
{
	public static void main(String[] args)
	{
		int f1, f2 = 0, f3 = 1;
		System.out.println("enter any number to get a fibonacci series");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("****** fibonacci Series *********");
		for(int i = 1; i<= n; i++)
		{
			System.out.print(" " + f3 + " ");
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
		}
	}
}
