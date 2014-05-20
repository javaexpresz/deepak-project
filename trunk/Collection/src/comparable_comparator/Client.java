package comparable_comparator;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String i1=(String)o1;
		String i2=(String)o2;
		/*if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		return 0;*/
		//return +1;
		//return -1;
		//return 0;
		return -i1.compareTo(i2);
		//return i2.compareTo(i1);
		//return -i2.compareTo(i1);
	}
	
}
public class Client {
public static void main(String[] args) {
	TreeSet t=new TreeSet(new MyComparator());
	/*t.add(10);
	t.add(4);
	t.add(10);
	t.add(4);
	t.add(23);
	t.add(12);
	t.add(24);*/
	t.add("zensar");
	t.add("blore");
	t.add("zensar");
	t.add("hydrabad");
	t.add("hydrabad");
	t.add("sonar");
	t.add("lohar");
	System.out.println(t);
}
}
