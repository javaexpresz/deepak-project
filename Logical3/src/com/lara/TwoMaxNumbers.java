package com.lara;
public class TwoMaxNumbers
{
	public void printMaxTwoNumber(int []num)
	{
		int maxOne = 0;
		int maxTwo = 0;
		for(int n:num)
		{
			if(maxOne<n)
			{
				maxTwo = maxOne;
				maxOne = n;
			}
			else if(maxTwo<n)
			{
				maxTwo = n;
			}
		}
		System.out.println("first Max number:" + maxOne);
		System.out.println("Second Max Number:" + maxTwo);
	}
	public static void main(String[] args)
	{
		int []num = {5,6 ,34,26,3,67};
		TwoMaxNumbers tms = new TwoMaxNumbers();
		tms.printMaxTwoNumber(num);
		
	}
}