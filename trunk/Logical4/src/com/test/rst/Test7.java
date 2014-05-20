package com.test.rst;

import java.util.Scanner;

public class Test7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		
		int n = sc.nextInt(); 
		int temp = n;
		while(temp>0)
		{
			if(temp%2 == 0 || temp == 1)
			{
				temp = temp/2;
			}
			else
			{
				System.out.println( n + " is not power of 2");
				return;
			}
		}
		System.out.println(n +" is a power of 2");
	}
}
