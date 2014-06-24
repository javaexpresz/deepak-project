package com.set;

import java.util.HashSet;
import java.util.Iterator;


public class Client4 {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(99);
	h.add(9);
	h.add(99);
	h.add(9);
	System.out.println(h);
	System.out.println(h.size());
}
}
