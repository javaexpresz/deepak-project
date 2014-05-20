package com.matrix;

import java.util.Scanner;

public class TraceMatrix
{
	public static void main(String[] args)
	{
		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 9 elements");
		int trace = 0;
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("entered matrix is:");
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.print("\t" + a[i][j]);
			}
			System.out.println();
		}
		System.out.println("entered matrix is");
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.print("\t" + a[j][i]);
			}
			System.out.println();
		}
	/*	for(int i = 0; i<3; i++)
		{
			trace = trace + a[i][i];
		//	System.out.print("\t" + a[i][i]);
			
		}
		System.out.println(trace);*/
	}
}
