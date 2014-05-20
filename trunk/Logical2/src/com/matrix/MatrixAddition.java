package com.matrix;

import java.util.Scanner;

public class MatrixAddition
{
	public static void main(String[] args)
	{
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		System.out.println("enter 9 element for a matrix");
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter 9 elements for b matrix");
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("sum for a and b matrix");
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				c[i][j] = a[i][j]*b[i][j];
				System.out.print("\t" + c[i][j]);
			}
			System.out.println();
		}
		
	}
}
