package com.rst;

public class ToCharArrayManager1
{
	public static void main(String[] args)
	{
		String str = "abcjavaj2eeprogrammer";
		int len = str.length();
		
		char ch[] = new char[len];
		ch = str.toCharArray();
		for(char c1 : ch)
		{
			System.out.print(c1 +"-->");
		}
	}
}
