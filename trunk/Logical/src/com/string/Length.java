package com.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Length {
public static void main(String[] args) throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the string");
	String s=br.readLine();
	int length=0;
	char ch[]=s.toCharArray();
	for(char count:ch){
		length++;
	}
	System.out.println(length);
}
}
