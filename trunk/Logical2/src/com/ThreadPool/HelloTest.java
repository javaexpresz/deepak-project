package com.ThreadPool;



class HelloTest 
{
	 void printClassName(Object obj)
	 {
         System.out.println("The class of " + obj +
                            " is " + obj.getClass().getName());
     }
	public void h1()
	{
		System.out.println("i am from h1");
	}
	public static void main(String[] args)
	{
		HelloTest h1 = new HelloTest();
		int i=9;
		h1.printClassName(i);
	}
}
