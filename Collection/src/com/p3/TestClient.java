package com.p3;

import java.util.ArrayList;
import java.util.List;

public class TestClient {
public static void main(String[] args) {
	Employee e1=new Employee(103, "Jeetu", 12344);
	Employee e2=new Employee(102, "Amit", 88999);
	Employee e3=new Employee(109, "Zensar", 12344);
	Employee e4=new Employee(104, "Quno", 88999);
	List<Employee> emp=new ArrayList<Employee>();
	emp.add(e1);
	for(Employee e:emp){
		System.out.println(e);
	}

}
}
