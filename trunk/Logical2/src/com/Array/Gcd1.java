package com.Array;

import java.util.Scanner;

public class Gcd1
{
	public static void main(String[] args)
	{
		int a, b, c, r,f;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a 3 number");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		r = gcd(a, b);
		f = gcd(r, c);
		System.out.println(f);
	}
	private static int gcd(int m, int n)
	{
		while(m != n)
		{
			if(m>n)
			{
				m = m - n;
			}
			else
			{
				n = n-m;
			}
		}
		return m;
	}
}
