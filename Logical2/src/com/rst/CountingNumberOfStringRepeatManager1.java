package com.rst;

import java.util.Arrays;

public class CountingNumberOfStringRepeatManager1
{
	public static void main(String[] args)
	{
		String s1[] = {"atul", "thakur","atul","kumar"};
		String s2[] = {"ram", "thakur","kumar","hello"};
		String total[] = new String[8]; 
		
		
		for(int i = 0; i<s1.length; i++)
		{
			total[i] = s1[i];
		}
		int inc =s1.length-1;
		for(int i = 0; i<s2.length; i++)
		{
			inc++;
			total[inc] = total[i];
		}
		//System.out.println(total[0]);
		for(int i = 0; i<total.length; i++)
		{
			int count = 0;
			for(int j = i; j>=0; j--)
			{
				if(total[i] == total[j])
				{
					count ++;
				}
			}
			
			if(count == 1)
			{
				int count1 = 0;
				for(int k = 0; k<total.length; k++)
				{
					if(total[i] == total[k])
					{
						count1++;
					}
				}
				System.out.println(total[i] );
			}
		}
	}
}
