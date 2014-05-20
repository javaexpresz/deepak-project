package com.rst;

public class Test2
{
	//String s2;
	public static void test(int i)
	{
		i = i+1;
		System.out.println(i);
		
	}
	public static void main(String[] args)
	{
		String s1 = new String("abc");
		System.out.println(s1);
		s1 = new String("xyz");
		System.out.println(s1);
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		System.out.println(sb.hashCode());
		sb.append("xyz");
		System.out.println(sb.hashCode());
	}
}
