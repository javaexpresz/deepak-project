package com.day1.p1;

public class F {
public static void main(String[] args) {
	int[] x=new int[4];
	System.out.println(x.length);
	for(int i=0;i<x.length;i++){
		System.out.println(x[i]);
	}
	for(int i1:x){
		System.out.println(i1);
	}
}
}
