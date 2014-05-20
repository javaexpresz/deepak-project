package com.lara;

public class UserImmutable
{
	private int i;
	
	public UserImmutable(int i)
	{
		this.i = i;
		System.out.println(i);
	}
	public int get()
	{
		return i;
	}
	public UserImmutable set(int i)
	{
		if(this.i == i)
		{
			return this;
		}
		else
		{
			return new UserImmutable(i);
		}
	}
	public String toString()
	{
		return "i=" + i;
	}
	
	public static void main(String[] args)
	{
		UserImmutable uobj = new UserImmutable(5);
		uobj.set(15);
		System.out.println(uobj.get());
		System.out.println(uobj.i);
	}
}
