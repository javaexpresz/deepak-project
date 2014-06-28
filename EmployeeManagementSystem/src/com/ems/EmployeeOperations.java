package com.ems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EmployeeOperations {
public static void main(String[] args)throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Employee emp=new Employee();
	JDBCEmployeeDAO operation=new JDBCEmployeeDAO();
	System.out.println("Enter 1 for Insert the Data : ");
	System.out.println("Enter 2 for Upadate the Data : ");
	System.out.println("Enter 3 for Delete the Data : ");
	System.out.println("Enter 4 for View  Data By ID : ");
	System.out.println("Enter 5 for View All Data : ");
	/*boolean hasError=false;
	try{
		int var=Integer.parseInt(br.readLine());
		System.out.println("inserted data :"+var);
	}catch(Exception e){
		hasError=true;		
	}
	if(!hasError){
		operation.add(emp);
	}else{
		System.out.println("Plz enter only digit");
		int var=Integer.parseInt(br.readLine());
	}*/
	int var=Integer.parseInt(br.readLine());
	//System.out.println("inserted data :"+var);
		if(var==1){
		operation.add(emp);
		try
		{
		 int id=Integer.parseInt(br.readLine());
		 operation.deleteById(id);
		}catch(Exception e){
			System.out.println("Enter Only digit");
		}
	}else if(var==2){
		operation.update(emp);
	}else if(var==3){
		System.out.println("Enter the ID");
		try
		{
		 int id=Integer.parseInt(br.readLine());
		 operation.deleteById(id);
		}catch(Exception e){
			System.out.println("Enter Only digit");
		}
		
	}else if(var==4){
		System.out.println("Enter the ID");
		int id=Integer.parseInt(br.readLine());
		operation.viewById(id);
	}else if(var==5){
		System.out.println(" ID         Name          Address");
		System.out.println("----        --------     ------------");
		operation.viewAllEmployee();
		
	}
}
}
