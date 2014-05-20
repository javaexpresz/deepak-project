package com.lara;

import java.util.Scanner;

public class Alphabet
{
	public static void main(String[] args)
	{
		char c;
		System.out.println("Enter a character");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		c = s.charAt(0);
		if(c>='A' && c<='Z' || c>='a' && c<='z')
		{
			System.out.println("given character is an alphabet");
		}
		else if(c>='0' && c<='9')
		{
			System.out.println("given character is digit");
		}
		else
		{
			System.out.println("given character is a special character");
		}
	}
}