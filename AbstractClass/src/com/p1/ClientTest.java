package com.p1;

abstract class Person{
	static int minAgeToVote=18;
	String name;
	long phone;
	Person(String name,long phone){
		this.name=name;
		this.phone=phone;
		System.out.println("Person(String,long) const\t"+this);
	}
	Person(){
		System.out.println("Person() const");
	}
	{
		System.out.println("IB Person");
	}
	abstract void showWorkInfo();
	abstract String getPersonType();
	void show(){
		//Person p=new Person();
		
	}
}
class Employee extends Person{
	Employee(){}
	Employee(String name,long phone){
		super(name,phone);
	}

	
	void showWorkInfo() {
		System.out.println("Employee Working in Company");
		
	}

	
	String getPersonType() {
		
		return "Employee";
	}
}
abstract class Student extends Person{}

class CurrentStudent extends Student{

	
	void showWorkInfo() {
		System.out.println("Attending classes");
		
	}

	@Override
	String getPersonType() {
		
		return "CurrentStudent";
	}
	
}
class OldStudent extends Student{

	@Override
	void showWorkInfo() {
		System.out.println("searching for job");
		
	}

	@Override
	String getPersonType() {
		
		return "OldStudent";
	}
	
}
class PersonService{
	static Person getInstance(String cName){
		if(cName.equals("Employee")){
			return new Employee();
		}else if(cName.equals("OldStudent")){
			return new OldStudent();
		}else if(cName.equals("CurrentStudent")){
			return new CurrentStudent();
		}else{
			return null;
		}
	}
}
public class ClientTest {
public static void main(String[] args) {
	System.out.println(Person.minAgeToVote);
	Person per=null;
	per=new Employee("sri", 99999);
	per.showWorkInfo();
	System.out.println(per.name+"\t"+per.phone);
	per=new OldStudent();
	per.showWorkInfo();
	per=new CurrentStudent();
	per.showWorkInfo();
	System.out.println("*****************");
	Person p=null;
	p=PersonService.getInstance("Employee");
	System.out.println(p.getPersonType());
	p=PersonService.getInstance("OldStudent");
	System.out.println(p.getPersonType());
	p=PersonService.getInstance("CurrentStudent");
	System.out.println(p.getPersonType());
	
}
}
