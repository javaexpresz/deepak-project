package com.list;

import java.util.LinkedList;

public class LinkedListClient1 {
public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.add("sri");
	ll.add(99);
	ll.add(null);
	ll.add(0);
	System.out.println(ll);
	ll.set(0, "srinivas");
	System.out.println(ll);
	ll.add(3, "dande");
	System.out.println(ll);
	ll.removeLast();
	System.out.println(ll);
	ll.removeFirst();
	System.out.println(ll);
	ll.addFirst("deepak");
	ll.addLast("goswami");
	System.out.println(ll);
	ll.getFirst();
	System.out.println(ll);
}
}
