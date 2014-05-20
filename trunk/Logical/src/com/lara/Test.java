package com.lara;

class MyException extends Exception
{
//	int price;
//	public MyException(int price)
//	{
//		this.price = price;
//	}
	public String toString()
	{
		return "price should be more then 0" ;
	}
}
public class Test
{
	public static void main(String[] args) throws MyException
	{
		int price = 11;
		if(price<0)
		{
			throw new MyException();
		}
		else
		{
			System.out.println("price is fine" + price);
			
		}
	}
}
