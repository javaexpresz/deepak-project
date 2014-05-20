package com.matrix;

import java.util.Scanner;

public class Matrix
{
	public static void main(String[] args)
	{
		int a[][] = new int[3][3];
		System.out.println("enter 9 elements for 3*3 matrix");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("given matrix is");
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.print("\t" + a[i][j]);
			}
			System.out.println();
		}
		System.out.println("Reading left diagonal elements");
		for(int i = 0; i<3; i++)
		{
			System.out.println(a[i][i]);
		}
		sc.close();
	}
}
