package com.test.rst;

import java.util.HashMap;
import java.util.Scanner;

public class NumericToAlphabetic
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a values");
		String str = sc.next();
		HashMap<Integer, String> singlewrd = new HashMap<>();
		HashMap<Integer, String> tenplc = new HashMap<>();
		HashMap<Integer, String> hundredplc = new HashMap<>();
		HashMap<Integer, String> thousplc = new HashMap<>();
		HashMap<Integer, String> lakplc = new HashMap<>();	
		HashMap<Integer, String> crorplc = new HashMap<>();		
		singlewrd.put(1, "one");
		singlewrd.put(2, "two");
		singlewrd.put(3, "three");
		singlewrd.put(4, "four");
		singlewrd.put(5, "five");
		singlewrd.put(6, "six");
		singlewrd.put(7, "seven");
		singlewrd.put(8, "eight");
		singlewrd.put(9, "nine");
		String i=null;
		char l[] =str.toCharArray();
		for(int h = 0 ; h<l.length ;h++)
		{	
		}
	}
}
