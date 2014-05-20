package com.lara;

import java.util.Scanner;

public class ArmstrongNo
{
	public static void main(String[] args)
	{
		int r, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int n = sc.nextInt();
		int temp = n;
		while(temp>0)
		{
			r = temp%10;
			sum = sum +r*r*r;
			temp = temp/10;
		}
		if(sum == n)
		{
			System.out.println("enter the no is Armstrong");
		}
		else
		{
			System.out.println("no is not Armstrong");
		}
	}
}
