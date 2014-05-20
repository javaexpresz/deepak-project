package com.matrix;

import java.util.Scanner;

public class MatrixMul
{
	public static void main(String[] args)
	{
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 9 elements for a matrix");
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter 9 elements for b matrix");
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				c[i][j] = 0;
				for(int k = 0; k<3; k++)
				{
					c[i][j] = c[i][j] + a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("A matrix is");
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.print("\t" + a[i][j]);
			}
			System.out.println();
		}
		System.out.println("B matrix is");
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.print("\t" + b[i][j]);
			}
			System.out.println();
		}
		System.out.println("multiplication is");
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.print("\t" + c[i][j]);
			}
			System.out.println();
		}
	}
}
