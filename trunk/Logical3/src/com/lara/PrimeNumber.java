package com.lara;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		if(n>1 && n%2==1||n==2)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}
}
