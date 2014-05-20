package com.matrix;

import java.util.Scanner;

public class NormMatrix
{
	public static void main(String[] args)
	{
		int a[][] = new int[3][3];
		int norm = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 9 number");
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter matrix is:");
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.print("\t" + a[i][j]);
				norm = norm + a[i][j]*a[i][j];
			}
			System.out.println();
		}
		System.out.println("norm of a matrix is = " + norm);
	}
}
