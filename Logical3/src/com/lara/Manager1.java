package com.lara;

public class Manager1
{
	public static void main(String[] args)
	{
		MyList list = new MyList();
		list.add("xyz");
		list.add('a');
		list.add(234.56);
		list.iterateAll();
	}
}
