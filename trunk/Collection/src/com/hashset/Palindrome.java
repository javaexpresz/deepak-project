package com.hashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int r,n,rev=0,t;
	
	System.out.println("enter the no.");
	n=Integer.parseInt(br.readLine());
	t=n;
	while(t>0){
		r=t%10;
		rev=rev*10+r;
		t=t/10;
	}
	if(n==rev)
		System.out.println("palindrome");
	else
		System.out.println("not palindrm");
}
}
