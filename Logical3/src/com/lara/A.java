package com.lara;

import java.util.Arrays;

class A
{
	 int a[]={-10,0,5,9,3,-11,11};
	//int a[]={5,4,4,7,-3,5,9}; 
	public static void main(String[] args)
	{
	
		int farValue = new A().getFarValue(new A().a);
		System.out.println(farValue);
	}
	
	int getFarValue(int a[]){
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
			
		}
	
		int avg = sum/a.length;
		System.out.println(avg);
		int b[]=new int[8];	
	//   int c[] = new int[5];
		
		
		for(int i=0;i<a.length;i++)
		{
			
			b[i]= a[i]-avg;
			
		}
		int lower = a[0];
		
		System.out.println(Arrays.toString(b));
	
		int in=0;
		
	for(int i=0;i<a.length;i++)
		if(lower>b[i])
		{	lower = b[i];
			 in = i;
		}
		System.out.println(lower);
		
		return a[in];
		
	}
}