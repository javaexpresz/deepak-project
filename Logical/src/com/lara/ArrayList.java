package com.lara;

public class ArrayList
{
	Object elements[];
	int size; 
	static int capacity;
	public ArrayList()
	{
		capacity = 10;
		elements = new Object[capacity];
	}
	public void add(Object obj)
	{
		if(size == capacity)
		{
			alterCapacity();
		}
		elements[size++] = obj;
	}
	public int size()
	{
		return size;
	}
	public Object get(int index)
	{
		if(index>size || index<0)
		{
			throw new IndexOutOfBoundsException("index should be b/w 0 to" + (size-1));
		}
		return elements[index];
	}
	public void alterCapacity()
	{
		Object temp[];
		temp = elements;
		capacity = capacity*120/100;
		elements = new Object[capacity];
		for(int i = 0; i<temp.length; i++)
		{
			elements[i] = temp[i];
		}
	}
	public String toString()
	{
		StringBuffer sb = new StringBuffer("[");
		for(int i = 0; i<size; i++)
		{
			sb.append(elements[i] + ",");
		}
		//System.out.println("]");
		return sb.toString() + "]";
	}
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add("hello1");
		list.add("hello2");
		list.add("hello3");
		list.add("hello4");
		list.add("hello5");
		list.add("hello6");
		list.add("hello7");
		list.add("hello8");
		list.add("hello9");
		list.add("hello10");
		list.add("hello11");
//		list.add("hello12");
//		list.add("hello13");
//		list.add("hello14");
	//	System.out.println(capacity);
		System.out.println(list.get(1));
	}
}
