package com.lara;

import java.util.Scanner;

public class Upper
{
	public static void main(String[] args)
	{
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UpperCase Character");
		String s = sc.next();
		c = s.charAt(0);
		if(c>='A' && c<='Z')
		{
			c +=32;
		//	c = c+32;
			System.out.println("Lower Case Character\t" +c);
		}
		else
			System.out.println("plz enter a alphabet in UpperCase");
	}
}
