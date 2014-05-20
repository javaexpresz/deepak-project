package com.p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibo {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,fib,f0=1,f1=1,i=1;
		System.out.println("Enter the no.");
		n=Integer.parseInt(br.readLine());
		while(i<=n){
			
			fib=f0=f1;
			System.out.println(fib);
			f0=f1;
			f1=fib;
			i++;
		}
}
}
