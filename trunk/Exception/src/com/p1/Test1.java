package com.p1;

import java.io.IOException;

public class Test1 {
public static void main(String[] args) {
	try{
		int i=10/0;
	}catch(NullPointerException e){
		e.printStackTrace();
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
