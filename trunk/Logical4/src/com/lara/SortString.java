package com.lara;

import java.util.Arrays;
import java.util.Scanner;

public class SortString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String==>");
		String s1 = sc.next();
		String str[] = s1.split("");
	//	System.out.println(Arrays.toString(str));
		System.out.println(str.length);
		String temp;
		for(int i = 0; i<str.length; i++)
		{
	
			for(int j = i; j<str.length; j++)
			{
				if(str[j].compareTo(str[i])<0)
				{
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
				System.out.println(Arrays.toString(str));
				System.out.println("................");
			}
		}
	//	System.out.println(Arrays.toString(str));
	}
	
}
