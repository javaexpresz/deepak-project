package com.list;

import java.util.Stack;

public class StackClient {
public static void main(String[] args) {
	Stack s=new Stack();
	s.add("sri");
	s.add(99);
	s.add(null);
	s.push("A");
	s.push("B");
	//s.push(null);
	System.out.println(s);
	System.out.println(s.search("sri"));
	System.out.println(s.search(null));
}
}
