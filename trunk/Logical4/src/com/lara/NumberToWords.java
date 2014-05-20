package com.lara;

import java.util.Scanner;

public class NumberToWords
{
	public static void main(String[] args)
	{
		int num, temp, r = 0, rn = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		temp = num;
		while(temp>0)
		{
			r = temp%10;
			rn = rn*10 + r;
			temp = temp/10;
		}
		System.out.println(rn);
		while(rn>0)
		{
			r = rn%10;
			switch(r)
			{
			case 1 : System.out.println("ONE"); break;
			case 2 : System.out.println("TWO"); break;
			case 3 : System.out.println("THREE"); break;
			case 4 : System.out.println("FOUR"); break;
			case 5 : System.out.println("FIVE"); break;
			case 6 : System.out.println("SIX"); break;
			case 7 : System.out.println("SEVEN"); break;
			case 8 : System.out.println("EIGHT"); break;
			case 9 : System.out.println("NINE"); break;
			case 0 : System.out.println("ZERO"); break;
			}
			rn = rn/10;
		}
	}
}
