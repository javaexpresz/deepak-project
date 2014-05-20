package com.day2.p1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Test1 {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add(1);
	list.add(new Integer(99));
	list.add("sri");
	list.add(new Boolean(true));
	Iterator it=list.iterator();
	//list.add(7);
	while(it.hasNext()){
		//list.add(9);
		//System.out.println(it.next());
		Object obj=it.next();
		//list.add(998);
		System.out.println(obj);
		//list.add(90);
	}
	list.add(67);
	System.out.println(list);
	
}
}
