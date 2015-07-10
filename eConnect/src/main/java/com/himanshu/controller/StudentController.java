package com.himanshu.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sun.invoke.empty.Empty;

import com.himanshu.model.Student;
import com.himanshu.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/index")
	public String signupForm(Map<String, Object> map)
	{		
		Student student=new Student();
		map.put("student", student);
		
		return "studentsignup";
		
	}
	
	@RequestMapping("/loginform.do")
	public String loginForm(Map<String, Object> map)
	{		
		Student student=new Student();
		map.put("student", student);
		
		return "studentlogin";
		
	}
	
	@RequestMapping("/login.do")
	public String doLogin(@ModelAttribute Student student,Map<String, Object> map)
	{	
		try{
	    String stuemail=studentService.getStudent(student.getEmail()).getEmail();
	    String stupwd=studentService.getStudent(student.getEmail()).getPassword();
		
		if (stuemail!=null && stupwd!=null && !stuemail.equals("") && !stupwd.equals("") && stuemail.equals(student.getEmail())
					&& stupwd.equals(student.getPassword())) {
				map.put("student",
						studentService.getStudent(student.getEmail()));

				return "loginsuccess";
			}
		}
		catch(Exception e)
		{
		map.put("errormessage", "Email or password is wrong!");
		return "redirect:loginform.do";
		}
		return "redirect:loginform.do";
		
	}
	
	@RequestMapping(value="/signup.do", method=RequestMethod.POST)
	public String doSignup(@ModelAttribute Student student, BindingResult result, @RequestParam String action, Map<String,Object> map,Model model )
	{
		Student StudentResult=new Student();
		switch (action.toLowerCase()) {
		case "signup":
			studentService.add(student);
			StudentResult=student;
			model.addAttribute("successmessage", "You are successfully Registered! Thank You!");
			break;
		case "edit":
			studentService.edit(student);
			StudentResult=student;
			break;
		case "delete":
			studentService.delete(student.getEmail());
			StudentResult=new Student();
			break;
		case "search":
			Student searchedStudent=studentService.getStudent(student.getEmail());
			StudentResult=searchedStudent!=null? searchedStudent : new Student();
			break;
		default:
			break;
		}
		/*map.put("successmessage", "You are successfully Registered! Thank You!");*/
		map.put("student", StudentResult);
		map.put("studentList", studentService.getAllStudent());
		return "redirect:index";
		
		
	}
}
