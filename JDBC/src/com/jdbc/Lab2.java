package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab2 {
public static void main(String[] args) {
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	try{
	//1.Loading the DriverClass
	Class.forName("com.mysql.jdbc.Driver");
	//2. Create the connection
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb", "root", "mysql");
	st=con.createStatement();
	rs=st.executeQuery("select * from stud");
	while(rs.next()){
		int id=rs.getInt(1);
		String nm=rs.getString(2);
		String ph=rs.getString(3);
		System.out.println("SID : "+id+"\t"+"SName : "+nm+"\t"+"Phone : "+ph);
	}
	}catch(ClassNotFoundException cne){
		System.out.println("Driver Class Not Found");
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		//7. close/release the resources
		try{
	if(st!=null)st.close();
	if(con!=null)con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
}
