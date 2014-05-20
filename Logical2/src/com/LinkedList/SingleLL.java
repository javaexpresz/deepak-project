package com.LinkedList;
class Element1
{
	Element1 next;
	Object data;
}
public class SingleLL
{
	private Element1 front, back;
	
	public void add(Object data)
	{
		Element1 e = new Element1();
		e.data = data;
		if(front == null)
		{
			front = e;
		}
		else
		{
			back.next = e;
		}
	}
	public void iterate()
	{
		Element1 e = front;
		while(e != null)
		{
			System.out.println(e.data);
			e = e.next;
		}
	}
}
