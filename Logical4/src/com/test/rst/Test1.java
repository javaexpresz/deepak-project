package com.rst;

import java.util.Arrays;

public class Test1 
{
	public static void main(String ...args)
	{
		int j = 2;
		System.out.println(new Integer(j));
		Object obj = new Object();
		Object o1[] ={};
	//	o1 = obj;
		obj = o1;
		System.out.println(o1[0]);
		System.out.println(obj);
//		System.out.println(Arrays.toString(o1));
//		System.out.println(Arrays.toString(obj));
	}
}
