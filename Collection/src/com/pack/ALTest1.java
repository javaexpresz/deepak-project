package com.pack;

import java.util.LinkedList;
import java.util.ListIterator;

public class ALTest1 {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("aaa");
	l.add("bbb");
	l.add("ccc");
	l.add("ddd");
	System.out.println(l);
	ListIterator li=l.listIterator();
	while(li.hasNext()){
		String s=(String)li.next();
		if(s.equals("aaa")){
			li.remove();
		}
		if(s.equals("bbb")){
			li.set("baba");
		}
		
	}
	System.out.println(l);
}
}
