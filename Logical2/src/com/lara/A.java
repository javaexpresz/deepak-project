package com.lara;

import java.util.Arrays;
import java.util.Scanner;

public  class A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		//String s1 = sc.next();
		String s1 = sc.nextLine();
		
		String str[] = s1.split(" ");
//		char[] a = s1.toCharArray();
		
		//System.out.println(a.length);
		System.out.println(str.length);
		System.out.println(Arrays.toString(str));
		
//		for(int i = 0; i<a.length; i++)
//		{
//			int count1 = 0;
//			for(int j = i; j>=0; j--)
//			{
//				if(a[i] == a[j])
//				{
//					System.out.println(a[j]);
//					count1 ++;
//					
//				}
//			}
//			System.out.println("===========");
//			System.out.println(a[i] +":"+count1);
//		}
//		
		
		
		for(int i = 0; i<str.length; i++)
		{
			int count1 = 0;
			for(int j = i; j>=0; j--)
			{
				//System.out.println(str[j]);
				if(str[i].trim().equals(str[j].trim()))
				{
					System.out.println(str[j]);
					++count1;
					
				}
			}
			System.out.println(str[i] +":"+count1);
			System.out.println("===========");
			
		}
		
	}
}

