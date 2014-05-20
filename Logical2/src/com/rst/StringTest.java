package com.rst;

import java.util.Arrays;

public class StringTest
{
	static String name[] = {"Madras","Delhi","Ahmedabad","Calcutta","Bombay"};
	
	public static void main(String[] args)
	{
		String temp;
		
		for(int i = 0; i<name.length; i++)
		{
			for(int j = i+1; j<name.length; j++)
			{
				if(name[j].compareTo(name[i])<0)
				{
					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(name));
		for(int i = 0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
	}
}
