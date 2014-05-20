package com.lara;

public class CommonElementsInArray
{
	public static void main(String[] args)
	{
		int []arr1 = {1,3,2};
		int []arr2 = {4,2,3,1,4,1};
		for(int i = 0; i<arr1.length; i++)
		{
			for(int j = 0; j<arr2.length; j++)
			{	
				if(arr1[i] == arr2[j])
				{
					
					System.out.println(arr1[i]);
				}
			}
		}
	}
	
}