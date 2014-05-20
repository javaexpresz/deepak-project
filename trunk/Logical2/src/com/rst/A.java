package com.rst;

import java.util.Arrays;

public class A
{
	public static void main(String[] args)
	{
		String s = "I live in India";
		String[] split = s.split(" ");
		/*String result = "";
		for (int i = split.length - 1; i >= 0; i--) {
		  result += (split[i] + " ");
		}
		System.out.println(result.trim());*/
		System.out.println(Arrays.toString(split));
	}
}
