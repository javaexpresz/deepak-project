package com.ems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCEmployeeDAO implements EmployeeDAO{

	@Override
	public void add(Employee emp) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		String query="insert into employee(id,name,address)values(?,?,?)";
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter ID : ");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter Name : ");
			String name=br.readLine();
			System.out.println("Enter Address : ");
			String address=br.readLine();
			System.out.println("Do you want to save the data:Y/N?");
			String var=br.readLine();
			if(var.equalsIgnoreCase("y")){
				
			
			con=JDBCUtil.getMySQLConnection();
			ps=con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, address);
			int res=ps.executeUpdate();
			if(res>0){
				System.out.println("Data Inserted Successfully");
			}else{
				System.out.println("Failed on Insertion");
			}
			}else{
				System.out.println("Try again!");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanUp(con, ps);
		}
	}

	@Override
	public void update(Employee emp) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		String query="update employee set name=?,address=? where id=?";
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter ID : ");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter Name : ");
			String name=br.readLine();
			System.out.println("Enter Address : ");
			String address=br.readLine();
			con=JDBCUtil.getMySQLConnection();
			ps=con.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, address);
			ps.setInt(3, id);
			int res=ps.executeUpdate();
			if(res!=0){
				System.out.println("Data updated Successfully");
			}else{
				System.out.println("Data not updated");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanUp(con, ps);
		}
		
	}

	@Override
	public void deleteById(int id) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try{
			//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			con=JDBCUtil.getMySQLConnection();
			String query="delete from employee where id=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, id);
			int res=ps.executeUpdate();
			if(res!=0){
				System.out.println("Employee ID "+id+" is Deleted.");
			}else{
				System.out.println("Deletion Failed");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanUp(con, ps);
		}
	}

	@Override
	public Employee viewById(int id) throws SQLException {
		Employee emp=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getMySQLConnection();
			String query="select * from employee where id=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()){
				emp=new Employee();
				String name=rs.getString("name");
				String address=rs.getString("address");
				System.out.println(" ID     Name     Address");
				System.out.println("----  --------  ------------");
				System.out.println(id+"     "+ name+"     "+address);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanUp(con, ps, rs);
		}
		return emp;
		
	}

	@Override
	public List<Employee> viewAllEmployee() throws SQLException {
		List<Employee> empList=new ArrayList<Employee>();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getMySQLConnection();
			String query="select * from employee";
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();
			
				while(rs.next()){
					Employee emp=new Employee();
					int id=rs.getInt("id");
					String name=rs.getString("name");
					String address=rs.getString("address");
					//System.out.println(" ID     Name     Address");
					//System.out.println("----  --------  ------------");
					System.out.println(id+"          "+ name+"           "+address);
				}
			/*if(rs.next()){
				Employee emp=new Employee();
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String address=rs.getString("address");
				//System.out.println(" ID     Name     Address");
				//System.out.println("----  --------  ------------");
				System.out.println(id+"          "+ name+"           "+address);
			}*/
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanUp(con, ps, rs);
		}
		return null;
	}

}
