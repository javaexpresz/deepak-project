package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollectionIterator {
public static void main(String[] args) {
	List<String> mylist=new ArrayList<String>();
	mylist.add("core java");
	mylist.add("spring");
	mylist.add("hibernate");
	mylist.add("struts1.x");
	mylist.add("mysql");
	mylist.add("oracle");
	Iterator<String> itr=mylist.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
