package com.lara;

import java.util.Scanner;

public class ArmStrongNo
{
	public static void main(String[] args)
	{
		int sum = 0, r;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		while(temp != 0)
		{
			r = temp%10;
			sum = sum + r*r*r;
			temp = temp/10;
		}
		if(n == sum)
		{
			System.out.println("enter the number is ArmStrong number:" + n);
		}
		else
		{
			System.out.println("enter the number is not ArmStrong Number" + n);
		}
		
	}
}
