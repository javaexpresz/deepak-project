package com.hashcode;

public class Employee {

	int eid;
	String ename;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	
	@Override
	public int hashCode() {
		int i=Integer.toString(eid).hashCode();
		i=i+ename.hashCode();
		return i;
	}

	
	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee)obj;
		return this.eid==e.eid && this.ename==e.ename;
	}

	
	public static void main(String[] args) {
		Employee e1=new Employee(2, "avinash");
		Employee e2=new Employee(1, "avinash");
		
		System.out.println(e1.equals(e2));
	}
}
