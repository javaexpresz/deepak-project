package com.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test1 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>(Collections.nCopies(10, 5));
	System.out.println(al);
	for(int i=0;i<al.size();i++){
		System.out.println(al.get(i));
	}
}
}
