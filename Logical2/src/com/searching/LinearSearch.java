package com.searching;

public class LinearSearch
{
	public static void main(String[] args)
	{
		int a[] = {1,3,2,44,5,6,7,43};
		int pos, key=44, n = 20;
		pos = linearSearch(a, key, n);
		if(pos == 0)
		{
			System.out.println("seach unsuccessfull");
		}
		else
		{
			System.out.println("key found position at" + pos);
		}
	}
	public static int linearSearch(int a[], int key, int n)
	{
		for(int i = 0; i<n; i++)
		{
			if(key == a[i])
			{
				return i+1;
			}
		}
		return 0;
	}
}
