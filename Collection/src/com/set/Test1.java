package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
public static void main(String[] args) {
	Set s=new HashSet();
	s.add(null);
	s.add(null);
	
	s.add("sri");
	s.add(null);
	s.add(null);
	s.add("sri");
	System.out.println(s);
	Iterator it=s.iterator();
	while(it.hasNext()){
		Object ob=it.next();
		System.out.println(ob);
	}
}
}
