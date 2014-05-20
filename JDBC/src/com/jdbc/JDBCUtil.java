package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCUtil {
static{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}catch(ClassNotFoundException e){
		System.out.println("Driver Class not found");
	}
}
public static Connection getOracleConnection()throws SQLException{
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
	return con;
}
public static Connection getMySQLConnection()throws SQLException{
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb", "root", "mysql");
	return con;
}
public static void cleanUP(Connection con,Statement st){
	try{
		if(con!=null)con.close();
		if(st!=null)st.close();
	}catch(Exception e){
		e.printStackTrace();
	}
}
public static void cleanUp(Connection con,Statement st,ResultSet rs){
	try{
		if(con!=null)con.close();
		if(st!=null)st.close();
		if(rs!=null)rs.close();
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
