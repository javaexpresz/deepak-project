package com.lara;
import java.util.Scanner;

public class InsertionSort
{
	public static void insertionSort(int a[], int n)
	{
		int item,j,i;
		for(i = 0; i<n; i++)
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
		int a[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. to be sorting");
		int n = sc.nextInt();
		System.out.println("enter" + n + "numbers");
		for(int i = 0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		insertionSort(a, n);
		System.out.println("enter after sorting");
		for(int i = 0; i<n; i++)
		{
			System.out.println(a[i]+",");
		}
	}
}