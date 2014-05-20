package com.lara;

import java.util.Scanner;

public class CompoundInterest
{
	public static void main(String[] args)
	{
		float p,r,t,q;
		double ci;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principle");
		p = sc.nextInt();
		System.out.println("enter time");
		t = sc.nextFloat();
		System.out.println("enter rate");
		r = sc.nextFloat();
		q = 1 + r/100;
		ci = p*(Math.pow(q, t))-p;
		System.out.println("compound interest\t" + ci);
		
	}
}
