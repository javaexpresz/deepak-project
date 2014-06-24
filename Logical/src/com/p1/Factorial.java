package com.p1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
public static void main(String[] args)throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int num,fact=1;
	System.out.println("Enter the number for factorial");
	num=Integer.parseInt(br.readLine());
	for(int i=1;i<=num;i++){
		fact=fact*i;
	}
	System.out.println("Factorial : "+fact);
}
}
