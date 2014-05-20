package com.Array;

import java.util.Scanner;

public class ArraySize
{
	public static void main(String[] args)
	{
		int a[] = new int[1000];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size of an array");
		int n = sc.nextInt();
		System.out.println("enter" + n + "elements");
		for(int i = 0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0; i<n; i++)
		{
			sum = sum + a[i];
		}
		System.out.println("sum = " + sum);
	}
}
