package com.test.rst;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
	public static  void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first String:");
		String s1 = sc.next();
		String str1[] = s1.split("");
		int len1 = s1.length();
		
		System.out.println("enter second String:");
		String s2 = sc.next();
		String str2[] = s2.split("");
		int len2 = s2.length();
		String temp;
		if(len1 != len2)
		{
			System.out.println("pls provide the valid length:");
		}
		if(len1 == len2)
		{
			for(int i = 0; i<str1.length; i++)
			{
				
				for(int j = 1; j<str1.length; j++)
				{
					
					if(str1[j].compareTo(str1[i])<0)
					{
						temp = str1[i];
						str1[i] = str1[j];
						str1[j] = temp;
					}
				//	System.out.println(Arrays.toString(str1));
					
				}
				System.out.println(str1[i]);
			}
//			System.out.println(Arrays.toString(str1));
//			for(int i = 0; i<str2.length; i++)
//			{
//				for(int j = 1; j<str2.length; j++)
//				{
//					if(str2[j].compareTo(str2[i])<0)
//					{
//						temp = str2[j];
//						str2[j] = str2[i];
//						str2[i] = temp;
//					}
//				}
//			}
//			if(Arrays.toString(str1).equals(Arrays.toString(str2)))
//			{
//				System.out.println("given String can be a palindrome");	
//			}
//			else
//			{
//				System.out.println("given String can't be palindrome");
//			}
		}
		
	}	
}

