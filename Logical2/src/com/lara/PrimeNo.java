package com.lara;

import java.util.Scanner;

public class PrimeNo
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number%2 != 0 && number != 1 || number == 2)
		{
			System.out.println("enter the number is prime");
		}
		else
		{
			System.out.println("enter the number is not prime no.");
		}
	}
}
