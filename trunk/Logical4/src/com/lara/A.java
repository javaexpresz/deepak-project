package com.lara;

import java.util.Scanner;

public class A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter the number");
		int i= sc.nextInt();
		int n;
		int count=0;
		while(i!=0)
		{
	    //	i = i%10;
			i= i/10;
					
			count++;
		}
		System.out.println(count);
		
		
	}
	
}
