package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab1_a {
public static void main(String[] args) {
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	try{
	
	//2. Create the connection
	con=JDBCUtil.getMySQLConnection();
	//3. Prepare the SQL Statement
	String sql="insert into emp values(112,'amit',9999)";
	//4. Create the Jdbc statement
	st=con.createStatement();
	//5. Submit the query to DB
	int result=st.executeUpdate(sql);
	//6. Process the result
	System.out.println("Result : "+result);
	if(result>=1){
		System.out.println("Your Data Successfylly Inserted");
	}else{
		System.out.println("Something is missing");
	}
	rs=st.executeQuery("select * from emp");
	while(rs.next()){
		int id=rs.getInt(1);
		String nm=rs.getString(2);
		String ph=rs.getString(3);
		System.out.println("SID : "+id+"\t"+"SName : "+nm+"\t"+"Phone : "+ph);
	}
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		//7. close/release the resources
		JDBCUtil.cleanUp(con, st, rs);
	}
}
}
