package com.SpringKKExample.Service;

import com.SpringKKExample.DAO.EmployeeDAO;
import com.SpringKKExample.SpringJDBCTemplateExample.Employee;

public class EmployeeService {
	
private EmployeeDAO employeeDao;

public void createEmployee(Employee e) {
	employeeDao.createEmployee(e);
}

public EmployeeDAO getEmployeeDao() {
	return employeeDao;
}

public void setEmployeeDao(EmployeeDAO employeeDao) {
	this.employeeDao = employeeDao;
}

}
