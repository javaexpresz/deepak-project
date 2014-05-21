package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
public static void main(String[] args) {
	List li=new ArrayList();
	li.add(null);
	li.add(null);
	li.add(null);
	li.add(null);
	li.add(null);
	li.add(null);
	System.out.println(li);
	Iterator it=li.listIterator();
	while(it.hasNext()){
		Object ob=it.next();
		System.out.println(ob);
	}
}
}
