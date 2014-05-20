package com.lara;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class test
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(5);
		list.add(5);
		list.add(9);
		list.add(3);
		HashSet set = new HashSet(list);
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
