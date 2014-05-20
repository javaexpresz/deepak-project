package com.hashset;

import java.util.Hashtable;


public class HashSet1 {
public static void main(String[] args) {
	Hashtable<String, String> ht=new Hashtable<String, String>();
	ht.put("first", "first_value");
	ht.put("second", "second_value");
	ht.put("third", "third_value");
	System.out.println(ht);
	System.out.println("value"+ht.get("second"));
	System.out.println(ht.isEmpty());
	System.out.println(ht.remove("third"));
	System.out.println(ht);
	System.out.println(ht.size());
}
}
