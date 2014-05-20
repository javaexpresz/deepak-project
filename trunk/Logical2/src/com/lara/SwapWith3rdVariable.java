package com.lara;

import java.util.Scanner;

public class SwapWith3rdVariable
{
	public static void main(String[] args)
	{
		System.out.println("enter 2 numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("before swapping a\t" + a + ",b\t" + b);
		/*int temp;
		temp = a;
		a = b;
		b = temp;*/
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(" after swaped variable are/t" + a + "," + b);
	}
}
