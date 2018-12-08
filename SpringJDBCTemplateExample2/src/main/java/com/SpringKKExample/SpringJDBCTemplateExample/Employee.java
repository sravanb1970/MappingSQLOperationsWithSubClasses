package com.SpringKKExample.SpringJDBCTemplateExample;

public class Employee {
private int eId;
private String ename;
private String gender;
private String email;
public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Employee [eId=" + eId + ", ename=" + ename + ", gender=" + gender + ", email=" + email + "]";
}
public Employee(String ename, String gender, String email) {
	super();
	this.ename = ename;
	this.gender = gender;
	this.email = email;
}

	
	
}
