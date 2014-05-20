package com.lara;

import java.util.Scanner;

public class CompoundInterest
{
	public static void main(String[] args)
	{
		float p,r,t,q;
		double ci;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle");
		p = sc.nextFloat();
		System.out.println("Enter time");
		t = sc.nextInt();
		System.out.println("Enter Rate");
		r = sc.nextFloat();
		q = 1 + r/100;
		ci = p*(Math.pow(q, t)) - p;
		System.out.println("Compound Interest\t" + (ci+p));
		
	}
}
