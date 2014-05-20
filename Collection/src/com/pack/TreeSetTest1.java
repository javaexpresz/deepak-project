package com.pack;

import java.util.TreeSet;

public class TreeSetTest1 {
public static void main(String[] args) {
	TreeSet t=new TreeSet(new MyComparator());
	t.add(56);
	t.add(78);
	t.add(99);
	t.add(45);
	t.add(90);
	
	System.out.println(t);
}
}
