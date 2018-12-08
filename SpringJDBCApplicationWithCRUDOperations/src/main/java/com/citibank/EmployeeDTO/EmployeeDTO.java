package com.citibank.EmployeeDTO;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	private int id;
	private String ename;
	private String gender;
	private double salary;
	private String position;
	
	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", ename=" + ename + ", gender=" + gender + ", salary=" + salary
				+ ", position=" + position + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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

}
