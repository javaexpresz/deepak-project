package com;


 class B
{
	B()
	{
		test();
	}
	public void test()
	{
		System.out.println("from B");
	}
}
public class B2 extends B
{
	B2()
	{
		
	}
	public void test()
	{
		System.out.println("from B2");
	}
	public static void main(String[] args)
	{
		B2 b = new B2();
		System.out.println("--------->");
		b.test();
	}
}
