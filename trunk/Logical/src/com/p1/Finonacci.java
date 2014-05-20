package com.p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finonacci {
public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int prev=1,next=1,sum,n;
	System.out.println("enter the no.");
	n=Integer.parseInt(br.readLine());
	for(int i=1;i<=n;i++){
		System.out.println(prev);
		sum=prev+next;
		prev=next;
		next=sum;
	}
	
}
}
