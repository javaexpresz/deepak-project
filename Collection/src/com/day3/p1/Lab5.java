package com.day3.p1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Lab5 {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	System.out.println(hm);
	System.out.println(hm.size());
	System.out.println(hm.isEmpty());
	hm.put("sid", new Integer(99));
	hm.put("sname", "sri");
	hm.put("email", "sri@gml");
	System.out.println(hm.size());
	System.out.println(hm.isEmpty());
	System.out.println(hm.containsKey("sid"));;
	System.out.println(hm.containsKey("email"));
	System.out.println(hm.containsKey("dee"));
	System.out.println(hm.containsValue("sri"));
	System.out.println(hm.get("sname"));
	System.out.println(hm.put("sname", "vas"));
	System.out.println(hm);
	hm.put("sname1", "vasna");
	System.out.println(hm);
	hm.put(new Double(999.99), null);
	System.out.println(hm);
	Collection col=hm.values();
	System.out.println("using key set");
	Set s=hm.keySet();
	System.out.println(s);
	Iterator it=s.iterator();
	while(it.hasNext()){
		Object o1=it.next();
		String key="";
		if(o1!=null){
			key=o1.toString();
		}else{
			key=null;
		}
		Object o2=hm.get(key);
		String val="";
		if(o2!=null){
			val=o2.toString();
		}else{
			val=null;
		}
		System.out.println(key+"..."+val);
	}
	
}
}