package comparable_comparator;

public class Employee implements Comparable{
 int id;
 String name;
 int salary;
public Employee(){}
public Employee(int id, String name, int salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

public String toString() {
	return "id : " + id + " name : " + name + " salary :  "+ salary;
}

	public int compareTo(Object o) {
		int id1=this.id;
		Employee e1=(Employee)o;
		int id2=e1.id;
		if(id1>id2){
			return +1;
		}else if(id1<id2){
			return -1;
		}
		return 0;
	}
}
