package com.lara;

import java.util.ArrayList;

public class ArrayListTest
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(45);
		list.add("55");
		list.add("5");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("atul");
		System.out.println(list);
		
		System.out.println(list.subList(3, 5));
	
	}
}
