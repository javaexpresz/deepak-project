package com.util;

import java.util.ArrayList;

public class ArrayList_Test {
public static void main(String[] args) {
	ArrayList arr=new ArrayList();
	arr.add("4");
	arr.add("2");
	arr.add("1");
	arr.add("5");
	arr.add("3");
	arr.set(1, 1);
	if(arr.get(1)==arr.get(2)){
		System.out.println("equals");
	}else{
		System.out.println("not equals");
	}
}
}
