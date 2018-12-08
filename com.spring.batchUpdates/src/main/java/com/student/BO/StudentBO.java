package com.student.BO;

public class StudentBO {
	private int sno;
	private String sname, saddress;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public StudentBO(int sno, String sname, String saddress) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.saddress = saddress;
	}
	public StudentBO() {
		super();
	}
	@Override
	public String toString() {
		return "StudentBO [sno=" + sno + ", sname=" + sname + ", saddress=" + saddress + "]";
	}
	

}
