package com.lara;

import java.util.Scanner;

public class ForeignToCelsius
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Foreign Heat degree");
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();
		double c = (f-32)*5.0/9.0;
		System.out.println("Celsius Degrees are" + c);
	}
}
