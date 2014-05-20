package com.lara;		//Usage of LinkedList

public class Manager
{
	public static void main(String[] args)
	{
		SingleLL l = new SingleLL();
		l.add(10);
		l.add("hello");
		l.add(true);
		l.add(44.89);
		System.out.println(l);
		l.iterate();
	}
}
