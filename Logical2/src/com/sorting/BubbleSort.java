package com.sorting;

import java.util.Scanner;

public class BubbleSort
{
	public static void bubbleSort(int a[], int n)
	{
		int temp;
		for(int j = 1; j<n; j++)
		{
			for(int i = 0; i<n-j; i++)
			{
				if(a[i]>=a[i+1])
				{
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int n;
		int a[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of items to sort");
		n = sc.nextInt();
		
		System.out.println("enter " + n + " elements");
		for(int i = 0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		bubbleSort(a, n);
		System.out.println("sorted elements are\t");
		for(int i = 0; i<n; i++)
		{
			System.out.print("\t" + a[i]);
		}
	}
}
