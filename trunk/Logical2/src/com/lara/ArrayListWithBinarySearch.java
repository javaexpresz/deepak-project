package com.lara;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWithBinarySearch
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(2);
		list.add(5);
		list.add(9);
		list.add("hello");
		list.add("ram");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
