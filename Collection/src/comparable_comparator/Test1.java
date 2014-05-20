package comparable_comparator;

import java.util.ArrayList;
import java.util.Comparator;
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
	
}
class IdComparator implements Comparator{

	
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		if(e1.id==e2.id)return 0;
		else if(e1.id>e2.id)return 1;
		else return -1;
	}
	
}
public class Test1 {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add(new Employee(103,"raj"));
	l.add(new Employee(105,"vijay"));
	
	l.add(new Employee(110,"sunny"));
	l.add(new Employee(123,"ajay"));
	for(Employee ee:l){
		System.out.println(ee);
	}
}
}
