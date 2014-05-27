package comparable_comparator;

import java.util.TreeSet;

class Employee1 {
int eid;
String name;
 Employee1(){}
 Employee1(int eid, String name) {
	super();
	this.eid = eid;
	this.name = name;
}
public String toString(){
	return eid+"--"+name;
}
public int compareTo(Object obj){
	int eid1=this.eid;
	Employee1 e=(Employee1)obj;
	int eid2=e.eid;
	if(eid1<eid2)
		return -1;
	else if(eid1>eid2)
		return 1;
	else return 0;
}
 }
public class Employee {
	public static void main(String[] args) {
		Employee1 e1=new Employee1(12, "sri");
		Employee1 e2=new Employee1(10, "nivas");
		Employee1 e3=new Employee1(18, "dande");
		Employee1 e4=new Employee1(19, "deepak");
		Employee1 e5=new Employee1(15, "goswami");
		TreeSet t1=new TreeSet();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
	}
}

