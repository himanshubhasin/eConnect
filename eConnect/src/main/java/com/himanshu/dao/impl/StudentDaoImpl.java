package com.himanshu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.himanshu.dao.StudentDao;
import com.himanshu.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void add(Student student) {
		
		sessionFactory.getCurrentSession().save(student);
	}

	@Override
	public void edit(Student student) {
		
		sessionFactory.getCurrentSession().update(student);
		
	}

	@Override
	public void delete(int studentid) {
		
		//sessionFactory.getCurrentSession().delete(studentid);
		sessionFactory.getCurrentSession().delete(getStudent(studentid));
	}

	@Override
	public Student getStudent(int studentid) {
		
		return (Student)sessionFactory.getCurrentSession().get(Student.class, studentid);
	}

	@Override
	public List getAllStudent() {
		
		return sessionFactory.getCurrentSession().createQuery("from Student").list();
	}

}
