package com.lara;

import java.util.LinkedList;

class Astack
{
	private LinkedList list = new LinkedList();
	
	public void add(Object obj)
	{
		list.add(obj);
	}
	public Object getAttribute()
	{
		// Object obj = (Object)list.removeLast();
		return list.removeFirst();
	}
	public String toString()
	{
		return list.toString();
	}
	public int getSize()
	{
		return list.size();
	}
}
public class Stack
{
	public static void main(String[] args)
	{
		Astack a1 = new Astack();
		a1.add(90);
		a1.add(80);
		a1.add(59);
		a1.add("hello");
		a1.add("raj");
		System.out.println(a1);
		Object o1 = a1.getAttribute();
		System.out.println(a1);
		System.out.println(o1);
		Object o2 = a1.getAttribute();
		System.out.println(a1);
		System.out.println(o2);
	}
}
