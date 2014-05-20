package com.lara;

public class LinkedList
{
	class Element
	{
		Element next, prev;
		Object data;
	}
	private Element front, back;
	public void add(Object o1)
	{
		Element e = new Element();
		e.data = o1;
		if(front == null)
		{
			front = e;
		}
		else
		{
			back.next = e;
		}
		e.prev = back;
		back = e;
		back.next = front;
		front.prev = back;
	}
	public void iterate()
	{
		Element e = front;
		if(e != null)
		{
			System.out.println(e);
			e = e.next;
		}
	}
}