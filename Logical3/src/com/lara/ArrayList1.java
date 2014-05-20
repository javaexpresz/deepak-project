package com.lara;

import java.util.ArrayList;

public class ArrayList1
{
	public static void main(String[] args)
	{
		int total = 0;
		ArrayList list = new ArrayList();
		for(int i = 0; i<100; i++)
		{
			list.add(i);
			total = total + i;
		}
		list.remove(4);
	//	System.out.println(list.get(4));
		
		int sum= 0;
		for(int j = 0; j< list.size(); j++)
		{
			sum = sum + (int)list.get(j);
		}
		System.out.println(total-sum);
	}
}
