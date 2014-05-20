package com.searching;

import java.util.Arrays;

public class B
{
	static int a[] = {2,1,6,3,5,12};
	static int temp; 
	public static void main(String[] args)
	{
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<=i; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			//	System.out.println(Arrays.toString(a));
			}	
		//	System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}
}
