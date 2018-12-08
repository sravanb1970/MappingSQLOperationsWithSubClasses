package com.spring.jdbctemplate;

public class Employee {
private int id;
private String fname;
private String lname;
private int sal;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", sal=" + sal + "]";
}
public Employee(int id, String fname, String lname, int sal) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.sal = sal;
}
public Employee() {
	super();
}

}
