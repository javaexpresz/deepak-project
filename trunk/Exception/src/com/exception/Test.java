package com.exception;

public class Test {
public static void main(String[] args) {
	try{
		System.out.println("try start");
		int i=10/0;
		System.out.println("*********try end**********");
		return ;
	}catch(Exception e){
		System.out.println("catch start");
		e.printStackTrace();
		System.out.println("end catch");
	}
	//System.out.println("abac");
	finally{
		System.out.println("finally always will run");
	}
}
}
