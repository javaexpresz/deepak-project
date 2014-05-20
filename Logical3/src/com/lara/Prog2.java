package com.lara;
class Prog2 
{
	public static void main(String[] args) 
	{
		if(args.length != 2)
		{
			System.out.println("Please Enter Values");
			return;
		}
		//take the number from args
		//they would be in String form
		String s1 = args[0];
		String s2 = args[1];

		//convert them into numeric
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);

		//add them and display
		double d3 = d1 + d2;
		System.out.println("The sum = " + d3);
	}
}
