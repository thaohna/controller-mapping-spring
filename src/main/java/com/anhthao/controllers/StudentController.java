package com.anhthao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/students")
public class StudentController {
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newStudent() {
		System.out.println("New with GET");
		return "students/new";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String saveStudent() {
		System.out.println("New with POST");
		return "students/list";
	}
	
	@RequestMapping("/edit")
	public String editStudent() {
		return "students/edit";
	}
	
	@RequestMapping(value = "/new", params = "btnDelete", method = RequestMethod.POST)
	public String deleteStudent() {
		return "students/delete";
	}
	
	@RequestMapping(value = "/new", params = "btnList", method = RequestMethod.POST)
	public String listStudent() {
		return "students/list";
	}
}
