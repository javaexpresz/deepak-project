package com.lara;

import java.util.Arrays;

public class SortString
{
	public static void main(String[] args)
	{
		String s1 = "atul";
		char c[] = s1.toCharArray();
		Arrays.sort(c);
	//	String s2 = c.toString();
		System.out.println(Arrays.toString(c));
	}
}
