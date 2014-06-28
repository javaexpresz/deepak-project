package com.ems;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
public void add(Employee emp)throws SQLException;
public void update(Employee emp)throws SQLException;
public void deleteById(int id)throws SQLException;
public Employee viewById(int id)throws SQLException;
public List<Employee> viewAllEmployee()throws SQLException;
}
