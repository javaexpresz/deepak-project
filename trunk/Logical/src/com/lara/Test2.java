package com.lara;

public class Test2
{
	static int i;
	public static void main(String[] args)
	{
		System.out.println("hello\t" + i);
		i++;
		
		if(i<3)
		{
		//	System.out.println("abc");
		//	i++;
			main(null);
		}
		System.out.println("bye\t" + i);
	}
}
