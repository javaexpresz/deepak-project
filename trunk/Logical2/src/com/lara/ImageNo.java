package com.lara;

import java.util.Scanner;

public class ImageNo
{
	public static void main(String[] args)
	{
		int num;
		long image = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num = sc.nextInt();
		while(num>0)
		{
			image = image*10 + num%10;
			num = num/10;
		}
		System.out.println("Image of Numbers is" + image);
	}
}
