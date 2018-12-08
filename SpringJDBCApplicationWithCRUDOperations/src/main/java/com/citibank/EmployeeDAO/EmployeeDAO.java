package com.citibank.EmployeeDAO;

import java.util.List;

import com.citibank.Employee.Employee;

public interface EmployeeDAO {
	public abstract String addEmployee(Employee e);
public abstract String deleteEmployee(int employeeId);
public abstract String updateEmployee(int employeeId);
public abstract List<Employee> getAllEmployees();
public abstract void getEmployee( int employeeId);


}
