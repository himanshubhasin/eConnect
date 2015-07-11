package com.himanshu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.himanshu.dao.StudentDao;
import com.himanshu.model.Student;
import com.himanshu.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	public void add(Student student) {
		

		studentDao.add(student);
	}

	@Transactional
	public void edit(Student student) {
		
		studentDao.edit(student);

	}

	@Transactional
	public void delete(String email) {
		
		studentDao.delete(email);
	}

	@Transactional
	public Student getStudent(String email) {
		
		return studentDao.getStudent(email);
	}

	@Transactional
	public List getAllStudent() {
		
		return studentDao.getAllStudent();
	}
	
	@Transactional
	public void changePassword(Student student,String email)
	{
		studentDao.changePassword(student, email);
	}
	@Transactional
	public void updateProfile(Student student,String email) {
		
		 studentDao.updateProfile(student, email);
		 
	}

}
