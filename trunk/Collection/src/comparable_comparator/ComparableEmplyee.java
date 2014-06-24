package comparable_comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class MyComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		//int sal1=e1.salary;
		//int sal2=e2.salary;
		int sal1=e1.id;
		int  sal2=e2.id;
		if(sal1>sal2){
			return 1;
		}else if(sal1<sal2){
			return -1;
		}
		return 0;
		//return -n1.compareTo(n2);
	}

	
	
}
public class ComparableEmplyee {
public static void main(String[] args) {
	Employee e1=new Employee(1, "vijay", 2000);
	Employee e2=new Employee(4, "sonam", 3000);
	Employee e3=new Employee(5, "Zara", 5000);
	Employee e4=new Employee(3, "umar", 70000);
	TreeSet li=new TreeSet();
	//List li=new ArrayList();
	li.add(e1);
	li.add(e2);
	li.add(e3);
	li.add(e4);
	Iterator it=li.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	System.out.println("**********************");
	TreeSet l2=new TreeSet(new MyComp());
	l2.add(e1);
	l2.add(e2);
	l2.add(e3);
	l2.add(e4);
	Iterator it1=l2.iterator();
	while(it1.hasNext()){
		System.out.println("iterator");
		System.out.println(it1.next());
	}
	
}
}
