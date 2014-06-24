package com.note1;

import java.util.ArrayList;
import java.util.Iterator;

public class String1 {
public static void main(String[] args) {
	String s1="RACERAC";
    char c[]=s1.toCharArray();
	char c1[]=new char[s1.length()];
	ArrayList al=new ArrayList();
	ArrayList al1=new ArrayList();
	ArrayList al2=new ArrayList();

    boolean repeat;
	char temp; 
	System.out.println(c);
	int count;
	for(int i=0;i<c.length;i++){
		al1.add(c[i]);
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					al.add(c[i]);
					System.out.println("al :"+al);
				}
				}
			
		}System.out.println("al1 :"+al1);
		
		Iterator it=al1.iterator();
		while(it.hasNext()){
			temp=(Character) it.next();
			if(al.contains(temp)){
					}else{
						al2.add(temp);
						System.out.println("al :"+al2);
				
			}
		}
		
	}
	}


