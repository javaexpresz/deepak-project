package com.lara;

import java.util.Scanner;

public class Gcd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Gcd of the two number is" + findGCD(n1, n2));
	
	}
	  private static int findGCD(int number1, int number2) {
	        //base case
	        if(number2 == 0){
	            return number1;
	        }
	        return findGCD(number2, number1%number2);
	    }
}
