package com.lara;

public abstract class Hello
{
	abstract void h1();
	void t1()
	{
		h1();
	}
}
class HelloTest extends Hello
{
	public void h1()
	{
		System.out.println("i am from h1");
	}
	public static void main(String[] args)
	{
		HelloTest h1 = new HelloTest();
		h1.t1();
	}
}
