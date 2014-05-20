package com.day2.p1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test7 {
public static void main(String[] args) {
	//HashSet set=new HashSet();
	Set set=new HashSet();
/*	set.add(90);
	set.add(90);
	set.add(90);
	set.add(90);
	set.add(90);
	set.add(90);*/
	
	/*System.out.println(set.add(90));
	System.out.println(set.add(90));
	System.out.println(set.add(90));
	System.out.println(set.add(90));
	System.out.println(set.size());
	System.out.println(set);*/
	
	/*set.add(90);
	set.add(9);
	set.add(0);
	set.add(190);
	set.add(40);
	System.out.println(set);
	Iterator it=set.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}*/
	set.add("90");
	set.add(null);
	set.add(90);
	set.add(90.0);
	System.out.println(set.size());
	System.out.println(set);
}
}
