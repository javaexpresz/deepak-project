package com.searching;

public class anagram
{
	public static boolean isPalindrome(String str)
	{
		for(int i = 0; i<str.length(); i++)
		{
			for(int j = str.length(); j>0; j--)
			{
				if(str.charAt(i) != str.charAt(j))
				{
					return false;
				}
				else
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		String s1 = "madam";
		String s2 = "mmada";
		boolean isPalindrome = false;
		
	}
}
