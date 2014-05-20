package com.lara;

import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args)
	{
		int year;
		System.out.println("Enter any year for checking......it is leap year or not");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if(year%100 !=0 && year%4 == 0 || year%400 == 0)
		{
			System.out.println("enter year is Leap Year");
		}
		else
		{
			System.out.println("enter year is not a Leap Year");
		}
	}
}
