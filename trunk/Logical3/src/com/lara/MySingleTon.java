package com.lara;

public class MySingleTon
{
	private static MySingleTon myObj;
	static
	{
		myObj = new MySingleTon();
	}
	private MySingleTon()
	{
		
	}
	public static MySingleTon getInstance()
	{
		return myObj;
	}
	public void testMe()
	{
		System.out.println("hey it... is working");
	}
	public static void main(String[] args)
	{
		MySingleTon obj = getInstance();
		obj.testMe();
	}
}
