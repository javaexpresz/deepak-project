package com.lara;
import java.util.Scanner;

public class Alphabet
{
	public static void main(String[] args)
	{
		char c;
		System.out.println("Enter A character");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		c = s.charAt(0);
//		System.out.println(c);
		if(c>='A' && c<= 'Z' || c>= 'a' && c<= 'z')
			System.out.println("Given the character is alphabet\t" + c);
		else if(c>= '0' && c<= '9')
			System.out.println("Given the character is digit\r" + c);
		else
			System.out.println("Given the Character is special character\t" + c);
	}
}