package com.rst;

import java.util.Arrays;

public class StringRepeatedArrayCount
{
	public static void main(String[] args)
	{
		String []s1 = {"atul", "thakur", "atul","kumar","thakur"};
		String []s2 = {"ram", "kumar", "atul","singh","thakur"};
		String total[] = new String[50];
		String sTotal[] = null;
		for(int i = 0; i<s1.length; i++)
		{
			total[i] = s1[i];
		}
		int inc = s1.length-1;
		for(int j = 0; j<s2.length; j++)
		{
			inc++;
			total[inc] = s2[j];
		}
		for(int i= 0; i<total.length; i++)
		{
			
		}
	}
}
