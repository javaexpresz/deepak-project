package comparable_comparator;

import java.util.TreeSet;

class TestTest{
	int id;
	String name;
	TestTest(int id,String name){
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
public class Test {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(new TestTest(1, "zara"));
	ts.add(new TestTest(4, "wara"));
	ts.add(new TestTest(9, "lara"));
	System.out.println(ts);
}
}
