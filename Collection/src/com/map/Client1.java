package com.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Client1 {
public static void main(String[] args) {
	Map map=new LinkedHashMap();
	map.put("eid", new Integer(9999));
	map.put("phone", new Long(9999999L));
	map.put("name", "srinivas");
	map.put("valid", new Boolean(true));
	System.out.println(map);
	System.out.println("According to KEYS");
	Set s1=map.keySet();
	Iterator it1=s1.iterator();
	while(it1.hasNext()){
		//it1.next();
		System.out.println(it1.next());
	}
	System.out.println("According to Values");
	Collection col=map.values();
	Iterator it3=col.iterator();
	while(it3.hasNext()){
		System.out.println(it3.next());
	}
	System.out.println("According to Keys and Values");
	Set s2=map.entrySet();
	Iterator it2=s2.iterator();
	while(it2.hasNext()){
		System.out.println(it2.next());
	}
}
}
