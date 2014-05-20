package com.string;

public class ReverseWord {
public static void main(String[] args) {
	String str[]="deepak kumar goswami".split(" ");
	//String temp="";
	String finalStirng="";
	for(int i=str.length-1;i>=0;i--){
		finalStirng=finalStirng+str[i]+" ";
	}
	System.out.println(finalStirng);
}
}
