package com.Array;

import java.util.Scanner;

public class Gcd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a 2 no's for gcd");
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("gcd of" + a + "," + b + "=" + gcd(a, b));
	}
	static int gcd(int a, int b)
	{
		if(b == 0)
		{
			return a;
		}
		if(a<b)
		{
			return gcd(b,a);
		}
		return gcd(b, a%b);
	}
}
