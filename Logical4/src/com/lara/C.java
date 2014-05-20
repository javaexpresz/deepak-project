package com.lara;

abstract class B 
{
	public void test()
	{
		System.out.println("test");
	}
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
public class C extends B
{
	public static void main(String[] args)
	{
		C c1 = new C();
		c1.test();
		System.out.println("C-DONE");
	}
	
}
