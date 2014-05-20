package com.rst;

class TestInner
{
	final public static void main(String[] args)
	{
		final int i=10;	
		class InnerClass
		{
			public void test()
			{
				System.out.println(i);
			}
		}
		InnerClass class1 = new InnerClass();
		class1.test();
	}
	
}
