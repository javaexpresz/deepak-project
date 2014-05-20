package com.sorting;

import java.util.Scanner;

public class InsertionSort
{
	public static void insertionSort(int a[], int n)
	{
		int i, j, item;
		for(i=0; i<n; i++)
		{
			item = a[i];
			j = i-1;
			while(j>=0 && item<a[j])
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = item;
		}
	}
	public static void main(String[] args)
	{
		int n;
		int a[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers of items to sort");
		n = sc.nextInt();
		System.out.println("enter " + n + "numbers");
		for(int i = 0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		insertionSort(a, n);
		System.out.println("sorted elements are");
		for(int i = 0; i<n; i++)
		{
			System.out.println(a[i] + " ");
		}
	}
}
