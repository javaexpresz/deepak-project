package com.rst;

import java.util.*;  
class Simple{  
 public static void main(String args[]){  
   
  Hashtable hm=new Hashtable();  
  
  hm.put(100,"Amit");  
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");  
  
  Set set=hm.entrySet();  
  Iterator itr=set.iterator();  
  
  while(itr.hasNext()){  
	  System.out.println(itr.next());
//   Map.Entry m=(Map.Entry)itr.next();  
//   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  