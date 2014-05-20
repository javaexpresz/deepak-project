package com.rst;

import java.util.Scanner;

public class B
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter String:");
		String s1 = sc.nextLine();
		String s2[] = s1.split(" ");
		
		System.out.println(s2[0] == s2[0]);
	}
}
