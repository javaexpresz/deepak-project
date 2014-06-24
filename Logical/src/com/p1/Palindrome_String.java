package com.p1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome_String {
public static void main(String[] args) throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str,rev="";
	System.out.println("Enter the String");
	str=br.readLine();
	for(int i=str.length()-1;i>=0;i--){
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	if(rev.equals(str)){
		System.out.println("Palindrome");
	}else{
		System.out.println("not palindrome");
	}
}
}
