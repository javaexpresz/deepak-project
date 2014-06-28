package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializeDeserializeCustomer {
public static void serialize(List<Customer> clist,String fileName){
	try{
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName));
		out.writeObject(clist);
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
}
public static List<Customer> deSerialization(String fileName){
	List<Customer> newList=null;
	try{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName));
		newList=(List<Customer>)in.readObject();
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	return newList;
}
}
