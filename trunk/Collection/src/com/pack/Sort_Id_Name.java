package com.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employee{
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
class IdComparator implements Comparator{

	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		if(e1.id==e2.id){
			return 0;
		}else if(e1.id>e2.id){
			return 1;
		}else 
		return -1;
	}
	
}
class Name_Comparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		return e1.name.compareTo(e2.name);
	}
	
}
public class Sort_Id_Name {
public static void main(String[] args) {
	List al=new ArrayList();
	al.add(new Employee(104, "pagal"));
	al.add(new Employee(202, "diwan"));
	al.add(new Employee(389, "awara"));
	System.out.println("Sort by id");
	Collections.sort(al, new IdComparator());
		Iterator it=al.iterator();
		while(it.hasNext()){
			Employee e3=(Employee)it.next();
			System.out.println(e3.getId()+"\t"+e3.getName());
		}
		System.out.println("Sort by name");
		Collections.sort(al,new Name_Comparator());
		Iterator itname=al.iterator();
		while(itname.hasNext()){
			Employee e4=(Employee)itname.next();
			System.out.println(e4.id+"\t"+e4.name);
		}
}
}

