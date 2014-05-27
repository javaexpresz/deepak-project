package com.map;

import java.util.*;

public class Tree {
public static void main(String[] args) {
	Map map=new HashMap();
	map.put("id","null");
	map.put("null", "null");
	map.put("email", "sri@jlc");
	map.put("null","99999");
	
	System.out.println(map);
	Set keys=map.keySet();
	Iterator it1=keys.iterator();
	while(it1.hasNext()){
		Object obj=it1.next();
		System.out.println(obj);
	}
	System.out.println("**************");
	Collection col=map.values();
	Iterator it2=col.iterator();
	while(it2.hasNext()){
		System.out.println(it2.next());
	}
	System.out.println("***************");
	Set values=map.entrySet();
	Iterator it3=values.iterator();
	while(it3.hasNext()){
		System.out.println(it3.next());
	}
	System.out.println("-----------------------------");
	Map m=new LinkedHashMap();
	m.put("id","999");
	m.put("name", "sri");
	m.put("email", "sri@jlc");
	m.put("phone","99999");
	
	System.out.println(m);
	Set key=m.keySet();
	Iterator i1=key.iterator();
	while(i1.hasNext()){
		System.out.println(i1.next());
	}
	System.out.println("**************");
	Collection c1=m.values();
	Iterator i2=c1.iterator();
	while(i2.hasNext()){
		System.out.println(i2.next());
	}
	System.out.println("***************");
	Set s1=m.entrySet();
	Iterator i3=s1.iterator();
	while(i3.hasNext()){
		System.out.println(i3.next());
	}
	System.out.println("---------------------------");
	Map tree=new TreeMap();
	tree.put("null", 99);
	tree.put("null", "dande");
	tree.put("email", "dande@gmal.com");
	tree.put("null", 9999999999L);
	System.out.println(tree);
	Set t1=tree.keySet();
	Iterator ti1=t1.iterator();
	while(ti1.hasNext()){
		System.out.println(ti1.next());
	}
	System.out.println("***************");
	Collection tcol=tree.values();
	Iterator ti2=tcol.iterator();
	while(ti2.hasNext()){
		System.out.println(ti2.next());
	}
	System.out.println("*******");
	Set entry=tree.entrySet();
	Iterator tit=entry.iterator();
	while(tit.hasNext()){
		System.out.println(tit.next());
	}
}
}
