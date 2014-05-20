package com.lara;

import java.util.Scanner;

public class Vowel
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char c;
		String s1 = sc.next();
		c = s1.charAt(0);
		
		if(c>='A' && c<='Z' || c>='a' && c<= 'z')
		if(c == 'A' || c=='a' || c == 'E' || c == 'e' || c == 'I' || c== 'i' || c== 'O' || c== 'o' || c== 'U' || c == 'u')
			System.out.println("Enter the character is a Vovel");
		else
			System.out.println("enter the character is a Consonant");
	}
}
