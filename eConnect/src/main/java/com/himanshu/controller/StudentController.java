package com.himanshu.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.himanshu.model.Student;
import com.himanshu.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map)
	{		
		Student student=new Student();
		map.put("student", student);
		map.put("studentList", studentService.getAllStudent());
		return "student";
		
	}
	
	@RequestMapping(value="/student.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Student student, BindingResult result, @RequestParam String action, Map<String,Object> map )
	{
		Student StudentResult=new Student();
		switch (action.toLowerCase()) {
		case "add":
			studentService.add(student);
			StudentResult=student;
			break;
		case "edit":
			studentService.edit(student);
			StudentResult=student;
			break;
		case "delete":
			studentService.delete(student.getStudentid());
			StudentResult=new Student();
			break;
		case "search":
			Student searchedStudent=studentService.getStudent(student.getStudentid());
			StudentResult=searchedStudent!=null? searchedStudent : new Student();
			break;
		default:
			break;
		}
		map.put("student", StudentResult);
		map.put("studentList", studentService.getAllStudent());
		return "student";
	}
}
