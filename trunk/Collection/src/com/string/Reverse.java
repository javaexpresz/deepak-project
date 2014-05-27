package com.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reverse {
public static void main(String[] args) throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the string");
	String s1=br.readLine();
	String result="";
	String s2[]=s1.split("");
	for(int i=s2.length-1;i>=0;i--){
		result=result+s2[i];
	}
	System.out.println("Reverse : "+result);
}
}
