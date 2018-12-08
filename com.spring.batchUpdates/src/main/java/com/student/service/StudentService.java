package com.student.service;

import java.util.ArrayList;
import java.util.List;

import com.student.BO.StudentBO;
import com.student.DAO.StudenDAO;
import com.student.DTO.StudentDTO;

public class StudentService {
	
	private StudenDAO dao;

	
	public void setDao(StudenDAO dao) {
		this.dao = dao;
	}
	
	public String registerStudent(List<StudentDTO> listdto) {
	List<StudentBO> listbo=new ArrayList<StudentBO>();
	for(StudentDTO dto:listdto) {
		StudentBO bo=new StudentBO(dto.getSno(),dto.getSname(),dto.getSaddress());
		//pending from here, do it again now
	}
	
	
	return null;
	
	}

}
