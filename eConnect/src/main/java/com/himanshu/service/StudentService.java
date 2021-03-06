package com.himanshu.service;

import java.util.List;

import com.himanshu.model.Student;

public interface StudentService {

	public void add(Student student);
	public void edit(Student student);
	public void delete(String email);
	public Student getStudent(String email);
	public List getAllStudent();
	public void changePassword(Student student,String email);
	public void updateProfile(Student student,String email);
}
