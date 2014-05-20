package com.lara;

import java.util.Scanner;

public class Vowel
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any character");
		String s1 = sc.next();
		char c1 = s1.charAt(0);
		if(c1>= 'A' && c1<= 'Z' || c1>='a' && c1<= 'a')
		if(c1=='a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' ||c1=='A' || c1 == 'E' || c1 == 'I' || c1 == 'O' || c1 == 'U')
		{
			System.out.println("enter the character is vowel");
		}
		else
		{
			System.out.println("enter the character is a consonent");
		}
		else
		{
			System.out.println("plz enter alphabet");
		}
	}
}
