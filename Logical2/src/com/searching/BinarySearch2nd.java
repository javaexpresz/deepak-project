package com.searching;

public class BinarySearch2nd
{
	public static int binarySearch(int sArray[], int start, int end, int key)
	{
		if(start<end)
		{
			int mid =start + (end - start)/2;
			if(key<sArray[mid])
			{
				return binarySearch(sArray, start, mid, key);
			}
			else if(key>sArray[mid])
			{
				return binarySearch(sArray, mid+1, end, key);
			}
			else
			{
				return mid;
			}
		}
		return -(start+1);
	}
	public static void main(String[] args)
	{
		int a[] = {2,4,6,7,22,44,56,65};
		int index = binarySearch(a, 0, a.length, 2);
		System.out.println("key value 2 found at" + index + " index");
		index = binarySearch(a, 0, a.length, 56);
		System.out.println("key value 56 found at" + index + " index");
	}
}
