package com.lara;

import java.util.Scanner;

public class Alphabet
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any character");
		String s1 = sc.next();
		char ch = s1.charAt(0);
		
		if(ch>= 'A' && ch<= 'Z' || ch>= 'a' && ch<= 'z')
		{
			System.out.println("enter the character is alphabet");
		}
		else if(ch>= '0' && ch <= '9')
		{
			System.out.println("enter the character is digit");
		}
		else
		{
			System.out.println("enter the character is special character");
		}
	}
}
