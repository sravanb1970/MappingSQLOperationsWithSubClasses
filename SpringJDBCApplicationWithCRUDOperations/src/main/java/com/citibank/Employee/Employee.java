package com.citibank.Employee;

public class Employee {
private int Id;
private String ename;
private String gender;
private String email;
private double salary;
private String position;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
@Override
public String toString() {
	return "Employee [Id=" + Id + ", ename=" + ename + ", gender=" + gender + ", email=" + email + ", salary=" + salary
			+ ", position=" + position + "]";
}
public Employee(String ename, String gender, String email, double salary, String position) {
	super();
	this.ename = ename;
	this.gender = gender;
	this.email = email;
	this.salary = salary;
	this.position = position;
}
public Employee() {
	super();
}

}
