package com.lara;

public class Hello
{

	public static void main(String[] args)
	{
		String s1 = "ja";
		String s2 = s1+"va";
		String s = s2;
		System.out.println(s2);
		String s4 = new String("ja");
		System.out.println(s1 == s4);
		String s3 = "java";
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s == s3);//false
		System.out.println(s2.equals(s3));//true
	}
	
}