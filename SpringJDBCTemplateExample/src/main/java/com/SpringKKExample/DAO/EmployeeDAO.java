package com.SpringKKExample.DAO;

import java.util.List;

import com.SpringKKExample.SpringJDBCTemplateExample.Employee;

public interface EmployeeDAO {

	public abstract String createEmployee(Employee e);

	public abstract Employee getEmployeeById(int employeeId);

	public abstract List<Employee> getAllEmployees();

	public abstract void deleteEmployee(int employeeId);

	public abstract void updateEmailById(String newEmail, int employeeId);

}
