package com.lara;

public class RemoveDuplicate
{
	public static void main(String[] args) {

	    char[] str = { 'a', 'b', 'a','b','c','e','c' };

	    for (int i = 1; i < str.length; i++)
	    {
	        for (int j = 0; j < i; j++) 
	        {
	            if (str[i] == str[j])
	            {
	                str[i] = ' ';
	            }
	        }

	    }
	    System.out.println(str);
	}
}
