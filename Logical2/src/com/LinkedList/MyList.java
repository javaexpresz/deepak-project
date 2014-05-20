package com.LinkedList;
class Element
{
	private Element next;
	private Object data;
	
	public void add(Object data)
	{
		this.data = data;
	}
	public void setLink(Element next)
	{
		this.next = next;
	}
	public Element getLink()
	{
		return next;
	}
	public Object get()
	{
		return data;
	}
}
public class MyList
{
	private Element front, back;
	private Object data;
	
	public void add(Object data)
	{
		Element element = new Element();
		element.add(data);
		if(front == null)
		{
			front = element;
		}
		else
		{
			back.setLink(element);
		}
		back = element;
	}
	public void iterateAll()
	{
		Element element = front;
		while(element != null)
		{
			System.out.println(element.get());
			element = element.getLink();
		}
	}
}

