package com.spring.jdbctemplate;

import java.util.Map;

public interface DBOperations {
public int insert(Employee e );
public int getSalary(int no);
public Map<String, Object> listEmpDetails();
public int deleteEmp(int no);
public int updateEmpSalary(int no, int newSal);
}
