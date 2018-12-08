package com.citibank.EmployeeVO;

public class EmployeeVO {
private String id;
private String ename;
private String gender;
private String salary;

private String position;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}

public String getPosition() {
	return position;
}
public EmployeeVO() {
	super();
}
public EmployeeVO(String ename, String gender, String salary, 
		String position) {
	super();
	this.ename = ename;
	this.gender = gender;
	this.salary = salary;
	
	this.position = position;
}
@Override
public String toString() {
	return "EmployeeVO [id=" + id + ", ename=" + ename + ", gender=" + gender + ", salary=" + salary + 
			",  position=" + position + "]";
}
public void setPosition(String position) {
	this.position = position;
}

}
