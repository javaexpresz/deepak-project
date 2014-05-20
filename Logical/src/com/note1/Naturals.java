package com.note1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Naturals {
public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int sum=0,n;
	System.out.println("Enter the no.");
	n=Integer.parseInt(br.readLine());
	for(int i=1;i<=n;i++){
		sum=sum+i;
	}
System.out.println("Sum= "+sum);

}
}
