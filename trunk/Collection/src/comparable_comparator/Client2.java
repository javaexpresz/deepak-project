package comparable_comparator;

import java.util.TreeSet;

class Emp {
int eid;
String name;
Emp(){}
Emp(int eid, String name) {
	super();
	this.eid = eid;
	this.name = name;
}
public String toString(){
	return eid+"--"+name;
}
public int compareTo(Object obj){
	int eid1=this.eid;
	Emp e=(Emp)obj;
	int eid2=e.eid;
	if(eid1<eid2)
		return -1;
	else if(eid1>eid2)
		return 1;
	else return 0;
}
}
public class Client2 {
public static void main(String[] args) {
	Emp e1=new Emp(12, "sri");
	Emp e2=new Emp(10, "nivas");
	Emp e3=new Emp(18, "dande");
	Emp e4=new Emp(19, "deepak");
	Emp e5=new Emp(15, "goswami");
	TreeSet t1=new TreeSet();
	t1.add(e1);
	t1.add(e2);
	t1.add(e3);
	t1.add(e4);
	t1.add(e5);
}
}
