package com.day2.p1;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test4 {
public static void main(String[] args) {
	LinkedList ll=new  LinkedList();
	ll.add(22);
	ll.add("sri");
	ll.add(34);
	System.out.println(ll);
	/*System.out.println(ll.peek());
	System.out.println(ll.peekFirst());
	System.out.println(ll.peekLast());
	System.out.println(ll.poll()); 
	System.out.println(ll.pollLast());
	System.out.println(ll.pop());
*/	ListIterator lit=ll.listIterator();
	while(lit.hasPrevious()){
		System.out.println(lit.previous()+",");
	}
}
}
