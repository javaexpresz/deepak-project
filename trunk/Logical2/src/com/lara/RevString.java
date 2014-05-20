package com.lara;

public class RevString
{
	public static void main(String[] args)
	{
		String str = "atulthakur";
		String s1[] = str.split("");
		String s = "";
		for(int i = s1.length-1; i>=0; i--)
		{
			s = s+ s1[i];
		}
		System.out.println(s);
	}
	
}
