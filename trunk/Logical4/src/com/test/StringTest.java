/**
 * 
 */
package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTest
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader obj = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(obj);
		System.out.println("enter emp id");
		int id = Integer.parseInt(br.readLine());
		System.out.println("enter sex (m/f)");

		char sex = (char) br.read();
		br.skip(2);
		
		System.out.println("enter emp name");
		
		String name = br.readLine();
		
		System.out.println("id:" + id);
		System.out.println("sex :"+ sex);
		System.out.println("name :" + name);
		
	}
}
