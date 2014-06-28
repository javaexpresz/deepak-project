package com.serialization;

import java.util.ArrayList;
import java.util.List;

public class MainCustomer {
public static void main(String[] args) {
	List<Customer> clist=new ArrayList<Customer>();
	clist.add(new Customer(1, "sujay", 788899));
	clist.add(new Customer(2, "ajay", 32323));
	clist.add(new Customer(3, "vijay", 5454));
	clist.add(new Customer(4, "sanjay", 2323));
	clist.add(new Customer(5, "jay", 323244));
	System.out.println(clist);
	SerializeDeserializeCustomer.serialize(clist, "src/serfolder/customer.ser");
	System.out.println("Serialization Done");
	List<Customer> newCust=SerializeDeserializeCustomer.deSerialization("src/serfolder/customer.ser");
	System.out.println("New Customer : "+newCust);
}
}
