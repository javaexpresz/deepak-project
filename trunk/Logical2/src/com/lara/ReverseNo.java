package com.lara;

import java.util.Scanner;

public class ReverseNo
{
	public static void main(String[] args)
	{
		int num, a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to be reverse");
		num = sc.nextInt();
		a = num%10;
		num = num/10;
		b = num%10;
		num = num/10;
		c = num%10;
		System.out.println("Reverse No is\t" + (a*100+b*10+c));
	}
}
