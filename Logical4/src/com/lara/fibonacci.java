package com.lara;

import java.util.Scanner;

public class fibonacci
{
	public static void main(String[] args)
	{
		int f1, f2 = 0, f3 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number:");
		int num = sc.nextInt();
		for(int i = 0; i<num; i++)
		{
			System.out.println(f3);
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
		}
	}
}
