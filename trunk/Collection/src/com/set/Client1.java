package com.set;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class Client1 {
public static void main(String[] args) {
	Set s=new HashSet();
	s.add(99);
	s.add(89);
	s.add("spring");
	s.add(99);
	s.add("99");
	System.out.println(s);
	Iterator it=s.iterator();
	while(it.hasNext()){
		Object obj=it.next();
		System.out.println(obj);
	}
	System.out.println("*************");
	Vector v=new Vector();
	v.add("99");
	v.add(99);
	v.add(89);
	v.add("jva");
	System.out.println(v);
	Enumeration en=v.elements();
	while(en.hasMoreElements()){
		Object ob=en.nextElement();
		System.out.println(ob);
	}
	System.out.println("iterator vector");
	Iterator itr=v.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
