package com.Student.Service;

import com.Student.BO.StudentBO;
import com.Student.DAO.StudentDAO;
import com.Student.DTO.StudentDTO;

public class StudentService {
private StudentDAO dao;
private StudentBO bo;
private StudentDTO dto;
public StudentDAO getDao() {
	return dao;
}

public void setDao(StudentDAO dao) {
	this.dao = dao;
}

public String registerStudent(int id, String name, String address) {

id=dto.getSno();
name=dto.getSname();
address=dto.getSaddress();
bo.setSno(id);
bo.setSname(name);
bo.setSaddress(address);
	int result = dao.insert(bo);
	return "inserted";
}
}
