package com.SpringKKExample.DAO;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringKKExample.SpringJDBCTemplateExample.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jt;
	private DataSource dataSource;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jt=jt;
	}

	public String createEmployee(Employee e) {
String query="INSERT INTO EMPLOYEENEW(ENAME, GENDER, EMAIL) VALUES(?,?,?)";
int update=jt.update(query, e.getEname(),e.getGender(),e.getEmail());
if(update>0) {
	return "inserted";
}else
	return "not inserted";

	}

	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		
	}

	public void updateEmailById(String newEmail, int employeeId) {
		// TODO Auto-generated method stub
		
	}

}
