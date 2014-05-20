package com.lara;
import java.util.Scanner;

public class BubbleSort
{
	public static void bubbleSort(int a[], int n)
	{
		for(int j = 1; j<n; j++)
		{
			for(int i = 0; i<n-j; i++)
			{
				if(a[i]>=a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int a[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. to be sorting");
		int n = Integer.parseInt(sc.next());
		System.out.println("enter" + n + "numbers");
		for(int i = 0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		bubbleSort(a, n);
		System.out.println("after sorting elements are\t");
		for(int i = 0; i<n; i++)
		{
			System.out.println(a[i]);
		}
	}
}