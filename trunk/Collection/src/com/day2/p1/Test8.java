package com.day2.p1;

import java.util.HashMap;

public class Test8 {
public static void main(String[] args) {
	HashMap hm=new  HashMap();
	hm.put("abc", 200);
	hm.put("key", "element key");
	hm.put(500, true);
	System.out.println(hm);
	System.out.println(hm.get(500));
	System.out.println(hm.get("abc"));
	System.out.println(hm.get("key"));
	System.out.println(hm.get(200));
	System.out.println(hm.get(null));
}
}
