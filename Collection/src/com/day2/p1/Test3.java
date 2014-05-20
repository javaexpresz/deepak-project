package com.day2.p1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test3 {
public static void main(String[] args) {
	Map map=new HashMap();
	map.put("name", "srinivas");
	map.put("email", "sri@gmail.com");
	map.put("phone", new Long(999999L));
	map.put("id", 99);
	System.out.println(map);
	
	HashMap hmap=new HashMap();
	hmap.put(77,00);
	hmap.put("id", 101);
	hmap.put("name","sri");
	System.out.println(hmap);
	
}
}
