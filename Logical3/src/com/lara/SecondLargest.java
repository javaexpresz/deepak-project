package com.lara;

import java.util.Scanner;

public class SecondLargest
{
	public static void main(String[] args)
	{
		int k = 0;
		int s = 0;
		System.out.println("Enter value");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			int j=sc.nextInt();
			if(j>k)
			{
				s=k;
				k=j;
			}
		}
		System.out.println("Second largest is "+s);
	}
}
