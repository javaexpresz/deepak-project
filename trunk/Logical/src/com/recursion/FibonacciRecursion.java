package com.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FibonacciRecursion {
public static void main(String[] args) throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter no.");
	int n=Integer.parseInt(br.readLine());
	fib(n);
	
}
public static void fib(int n){
	int prev=1,next=1,sum;
	for(int i=1;i<=n;i++){
		System.out.println(prev);
		sum=prev+next;
		prev=next;
		next=sum;
		System.out.println(sum);
		fib(n);
		}
}
}
