package com.lara;

import java.util.Arrays;
import java.util.Scanner;

public class RevString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s1 = sc.nextLine();
		String str[] =s1.split(""); 
				 
		String s = "";
		
		for(int i = str.length-1; i>=0; i--)
		{
			s = s + str[i] + " ";
	//		System.out.println(str[i]);
		}
		System.out.println(s);
		
	/*	if(s.equals(s1))
		{
			System.out.println("palindrome");
			//break;
		}
		else
		{
			System.out.println("not palindrome");
		}*/
	}
}
