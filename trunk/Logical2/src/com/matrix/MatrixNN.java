package com.matrix;

import java.util.Scanner;

public class MatrixNN
{
	public static void main(String[] args)
	{
		int a[][] = new int[10][10];
		int n;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("enter number");
			n = sc.nextInt();
			if(n<1 || n>10)
			{
				System.out.println("error n should be 1-10");
			}	
		}
		while(n<1 || n>10);
		System.out.println("enter 9 elements for a matrix");
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
