package com.lara;

import java.util.Scanner;

public class ArmStrong
{
	public static void main(String[] args)
	{
		int q, b, r, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		q=num;
		while(q>0)
		{
			r = q%10;
			sum = sum +r*r*r;
			q = q/10;
		}
		if(sum == num)
		{
			System.out.println("the given number is ArmStrong number");
		}
		else
		{
			System.out.println("the given number is not ArmStrong number");
		}
	}
}
