package com.ems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
static{
	try{
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}catch(ClassNotFoundException e){
		System.out.println("DriverClass Not found");
	}	
}
public static Connection getMySQLConnection()throws SQLException{
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb", "root", "mysql");
	//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
	return con;
}
public static void cleanUp(Connection con,PreparedStatement ps)throws SQLException{
	if(con!=null)con.close();
	if(ps!=null)ps.close();
}
public static void cleanUp(Connection con,PreparedStatement ps,ResultSet rs)throws SQLException{
	if(con!=null)con.close();
	if(ps!=null)ps.close();
	if(rs!=null)rs.close();
}
}
