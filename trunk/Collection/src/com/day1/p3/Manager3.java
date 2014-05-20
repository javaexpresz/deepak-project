package com.day1.p3;

import java.util.ArrayList;

public class Manager3 {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add(90);
	list.add("avc");
	list.add(89.98);
	list.add(true);
	System.out.println(list.size());
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i));
	}
	System.out.println("*********************");
	for(Object obj:list){
		System.out.print(obj+",");
	}
}
}
