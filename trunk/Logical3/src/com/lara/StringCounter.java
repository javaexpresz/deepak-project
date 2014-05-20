package com.lara;
import java.util.Scanner;
public class StringCounter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String s1 = sc.next();
		System.out.println("length of a String is:" + StringLength(s1));
	}
	public static int StringLength(String s1)
	{
		if(s1.equals(""))
		{
			return 0;
		}
		else
		{
			System.out.println(s1.substring(1));
			return StringLength(s1.substring(1))+1;
		}
	}
}

