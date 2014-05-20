package com.day2.p1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test2 {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(1);
	v.addElement("sri");
	v.add(3);
	v.add(true);
	System.out.println(v);
	Iterator it=v.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	System.out.println("*************************");
	Enumeration en=v.elements();
	while(en.hasMoreElements()){
		System.out.println(en.nextElement());
	}
}
}
