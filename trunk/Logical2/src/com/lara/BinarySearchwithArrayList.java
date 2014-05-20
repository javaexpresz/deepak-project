package com.lara;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchwithArrayList
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add("abc");
		list.add(54);
		list.add("10");
		list.add("a");
		list.add(5);
		list.add(10);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, "10"));
		System.out.println(list);
	}
}
