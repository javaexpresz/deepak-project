package com.lara;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number--->");
		int num = sc.nextInt();
		int total=1;
		for(int i=1; i<=num; i++)
		{
			total = total*i;
		}
		System.out.println(total);
	}
}
