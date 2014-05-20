package com.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class Lab3 {
public static void main(String[] args) {
	Collection col=new ArrayList();
	System.out.println(col);
	System.out.println("size : "+col.size());
	System.out.println("Empty : "+col.isEmpty());
	col.add("spring");
	col.add("struts");
	col.add(999);
	col.add(89.89);
	System.out.println(col);
	System.out.println("size : "+col.size());
	System.out.println("Empty : "+col.isEmpty());
	System.out.println("after removing the elements");
	col.remove("struts");
	System.out.println("size : "+col.size());
	System.out.println("contaisn(Spring) : "+col.contains("spring"));
	System.out.println("contains(struts) : "+col.contains("struts"));
	System.out.println("prints all elements");
	Object data[]=col.toArray();
	for(int i=0;i<data.length;i++){
		System.out.println(data[i]);
	}
	System.out.println("****************");
	for(Object ob:col){
		System.out.println(ob);
	}
}
}
