package com.Student.DAO;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Student.BO.StudentBO;

public class StudentDAO {
	
	private DataSource ds;
private JdbcTemplate jt;
private static final String query="INSERT INTO STUDENT VALUES(?,?,?)";

	public void setDs(DataSource ds) {
		this.ds = ds;
		this.jt=new JdbcTemplate(ds);
	}
//here for insertion StudentBO bo is appropriate but as I'm not taking the values of 
	//studentDTo so I'm directly declaring variables here
	public int insert(StudentBO bo) {
		jt.update(query);
	int result=	jt.update(query, bo.getSno(),bo.getSname(),bo.getSaddress());
return result;
	}

}
