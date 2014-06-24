package com.util;

import java.util.TreeSet;

public class Test2 {
public static void main(String[] args) {
	TreeSet<String> t=new TreeSet<String>();
	t.add("a");
	t.add("c");
	t.add("aa");
	System.out.println(t);
	TreeSet<Integer> t1=new TreeSet<Integer>();
	t1.add(33);
	t1.add(5);
	t1.add(7);
	System.out.println(t1);
}
}
