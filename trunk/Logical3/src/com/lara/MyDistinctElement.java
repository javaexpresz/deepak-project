package com.lara;

public class MyDistinctElement
{
	public static void printDistinctElement(int arr[])
	{
		
		for(int i = 0; i<arr.length; i++)
		{
			boolean isDistinct = false;
			for(int j = 0; j<i; j++)
			{
				if(arr[i] == arr[j])
				{
					isDistinct = true;
					break;
				}
			}
			if(!isDistinct)
			{
				System.out.println(arr[i]+",");
			}
		}
	}
	public static void main(String[] args)
	{
		int nums[] = {2,2,8,7,6,8,9,7,2};
		MyDistinctElement.printDistinctElement(nums);
	}
}
