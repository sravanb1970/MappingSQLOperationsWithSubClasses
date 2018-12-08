package com.citibank.EmployeeBO;

public class EmployeeBO {
	private int id;
	private String ename;
	private String gender;
	private double salary;
	private String position;
	private double bonus;
	private double salary_after_increment;
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
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getSalary_after_increment() {
		return salary_after_increment;
	}
	public void setSalary_after_increment(double salary_after_increment) {
		this.salary_after_increment = salary_after_increment;
	}
	@Override
	public String toString() {
		return "EmployeeBO [id=" + id + ", ename=" + ename + ", gender=" + gender + ", salary=" + salary + ", position="
				+ position + ", bonus=" + bonus + ", salary_after_increment=" + salary_after_increment + "]";
	}
	
}
