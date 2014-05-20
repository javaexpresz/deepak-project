package com.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class Lab5 {
public static void main(String[] args) {
	Collection col=new  ArrayList();
	col.add("sri");
	col.add("nivas");
	col.add("dande");
	col.add("java");
	col.add("jsp");
	col.add("java");
	col.add("spring");
	col.add("jsp");
	System.out.println(col);
	Collection col2=new ArrayList();
	col2.add("java");
	col2.add("jdbc");
	col2.add("jsp");
	System.out.println(col2);
	System.out.println("col.removeAll(col2)");
	col.removeAll(col2);
	System.out.println(col);
	System.out.println(col2);
	
}
}
