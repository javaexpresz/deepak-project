package com.p1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumber {
public static void main(String[] args) throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int num,count=0;
	System.out.println("inter the number for prime number");
	num=Integer.parseInt(br.readLine());
	for(int i=1;i<=num;i++){
		if(num%i==0)
			count=count+1;
	}
	if(count==2){
		System.out.println("Prime");
	}else{
		System.out.println("not prime");
	}
}
}
