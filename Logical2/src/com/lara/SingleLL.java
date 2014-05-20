package com.lara;
class Element
{
	Element next;
	Object data;
}
public class SingleLL
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
