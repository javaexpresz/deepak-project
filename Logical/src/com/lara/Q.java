package com.lara;
class P
{
	P()
	{
		System.out.println("P()");
	}
//	 final void test()
//	{
//		System.out.println("test() of P");
//	}
}
public class Q extends P
{
	Q()
	{
		System.out.println(super.hashCode());
	}
	public static void main(String[] args)
	{
		P p1 = new Q();
	}
}
