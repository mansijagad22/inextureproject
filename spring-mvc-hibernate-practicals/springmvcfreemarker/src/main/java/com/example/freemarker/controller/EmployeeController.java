package com.example.freemarker.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.freemarker.model.Employee;
import com.example.freemarker.repository.EmployeeRepository;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository emprepository;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/test")
	public String test(Model model) {

		return "index";
	}
	
	@GetMapping("/showEmployees")
	public ModelAndView showEmployees(Model model) {
		
		List<Employee> emplist = this.emprepository.findAll();
		
		Map<String, Object> formv = new HashMap<>();
		formv.put("employees", emplist);
		return new ModelAndView("showEmployees",formv);
	}
}
