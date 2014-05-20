package com.searching;

import java.util.Scanner;

public class BinarySearch3
{
	private static int binarySearch(int item, int a[], int low, int high)
	{
		int mid;
		if(low<high)
		{
			mid = low + (high -low)/2;
			if(item>a[mid])
			{
				return binarySearch(item, a, mid+1, high);
			}
			else if(item<a[mid])
			{
				return binarySearch(item, a, low, mid);
			}
			else
			{
				return mid;
			}
		}
		return -(low+1);
	}
	public static void main(String[] args)
	{
		int n, key, pos;
		int a[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of n");
		n = Integer.parseInt(sc.next());
		System.out.println("enter" + n + "values in ascending order");
		for(int i = 0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("enter the no to be searched");
		key = Integer.parseInt(sc.next());
		pos = binarySearch(key, a, 0, n);

		System.out.println("searching element is at" + pos);
	}
}
