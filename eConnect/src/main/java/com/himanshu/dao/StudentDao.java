package com.himanshu.dao;

import java.util.List;

import com.himanshu.model.Student;

public interface StudentDao {

	public void add(Student student);
	public void edit(Student student);
	public void delete(int studentid);
	public Student getStudent(int studentid);
	public List getAllStudent();
}
