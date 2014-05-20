package com.rst;

public abstract class Test3
{
	public void hello()
	{
		System.out.println("helo");
	}
	public static void main(String[] args)
	{
		System.out.println("d");
	}
}
class T extends Test3
{
	public static void main(String[] args)
	{
		T t = new T();
		t.hello();
	}
	
	
}
