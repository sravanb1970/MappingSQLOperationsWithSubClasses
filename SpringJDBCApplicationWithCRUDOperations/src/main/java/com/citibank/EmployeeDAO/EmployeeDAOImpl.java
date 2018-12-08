package com.citibank.EmployeeDAO;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.citibank.Employee.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
//add dataSource object and JDBC Template object 
	
	private DataSource dataSource;
	private JdbcTemplate jt;
	
	public String addEmployee(Employee e) {
		
		return null;
	}

	public String deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public void getEmployee(int employeeId) {
		// TODO Auto-generated method stub
		
	}

}
