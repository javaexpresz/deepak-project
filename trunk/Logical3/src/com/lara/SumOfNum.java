package com.lara;
import java.util.Scanner;
public class SumOfNum
{
	public static void main(String[] args)
	{
		int num, num1, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = Integer.parseInt(sc.next());
		num1 = num;
		while(num !=0)
		{
			sum = sum + num % 10;
			num /=10;
		}
		System.out.println("SUM OF THE\t" + num1 + "\t IS\t" + sum);
	}
}
