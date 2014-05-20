package com.rst;

public class ImmutableClass
{
	private int i;
	
	public ImmutableClass(int i)
	{
		this.i = i;
	//	System.out.println(i);
	}
	public int getI()
	{
		return i;
	}
	public ImmutableClass setI(int i)
	{
		if(this.i == i)
		{
		//	System.out.println("if");
		//	System.out.println(this);
			return this;
		}
		else
		{
			return new ImmutableClass(i);
		}
	}
	public String toString()
	{
		return "i=" + i;
	}
	public static void main(String[] args)
	{
		ImmutableClass obj = new ImmutableClass(5);
		System.out.println(obj.setI(12));
	}
}
