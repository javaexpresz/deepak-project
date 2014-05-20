package com.lara;

import java.util.Scanner;

public class Upper
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any alphabet");
		String s1  = sc.next();
		char c = s1.charAt(0);
		if(c>='A' && c<= 'Z')
		{
			c +=32;
			System.out.println("enter the character is\t" + c);
		}
		else
		{
			System.out.println("enter the character is not in uppercase ");
		}
	}
}
