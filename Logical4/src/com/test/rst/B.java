package com.test.rst;
class D 
{

}
public class B extends D
{
	public synchronized void test()
	{
		System.out.println("B-test");
	}
	public static void main(String[] args)
	{
		/*Thread t1 = Thread.currentThread();
		System.out.println(t1);
		int i = "dddddddddd".length();
		System.out.println(i);*/
		B b1 = new B();
		b1.test();
	}
	
};
