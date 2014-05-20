package com.lara;
class A1
{
	void test()
	{
		System.out.println("from A1");
	}
}
public class B extends A1
{
	B()
	{
		super.test();
	}
	void test()
	{
		System.out.println("From B");
	}
	public static void main(String[] args)
	{
		A1 a = new B();
	//	a.test();
	}
}
