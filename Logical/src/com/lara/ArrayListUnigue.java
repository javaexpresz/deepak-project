package com.lara;

import java.util.ArrayList;

public class ArrayListUnigue
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(4);
		for(int i =0 ; i<list.size()-1;i++)
		{
			for(int j = 1;j<list.size();j++)
			{
				if(list.get(i)!=list.get(j))
				{
				 list2.add(list.get(i));		
				}
			}
		}
		System.out.println(list2.toString());
	}
}
