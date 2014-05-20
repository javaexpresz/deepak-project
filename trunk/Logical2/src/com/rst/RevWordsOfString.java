package com.rst;

import java.util.Arrays;
import java.util.Scanner;

public class RevWordsOfString
{
	public static void main(String[] args)
	{
		System.out.println("Enter your text:");
		Scanner sc = new Scanner(System.in);
		char ch;
		for(;;)
		{
			String s1 = sc.next();
			System.out.println();
			for(int i = s1.length()-1; i>=0; i--)
			{
				ch = s1.charAt(i);
				System.out.print(ch);
			}
		}
	}
}
