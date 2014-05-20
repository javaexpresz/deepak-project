package com.doubleLinkedList;
class Element
{
	Element next, prev; 
	Object data;
}
public class DoulbeLL
{
	private Element front, back;
	public void add(Object data)
	{
		Element e = new Element();
		e.data = data;
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
	}
	public void iterate()
	{
		Element e = front;
		while(e != null)
		{
			System.out.println(e.data);
			e = e.next;
		}
	}
}
