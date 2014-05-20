package com.doubleLinkedList;

public class Manager
{
	public static void main(String[] args)
	{
		DoulbeLL l = new DoulbeLL();
		
		l.add(45);
		l.add("tr");
		l.add(true);
		l.add("56");
		l.add(45.5);
		l.iterate();
	}
}
