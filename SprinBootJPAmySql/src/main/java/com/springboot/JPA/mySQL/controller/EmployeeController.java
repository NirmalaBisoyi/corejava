package com.springboot.JPA.mySQL.controller;   
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.JPA.mySQL.entity.Employee;
import com.springboot.JPA.mySQL.repos.EmployeeCrudRepo;


@RestController
public class EmployeeController {  
    

	@Autowired
	EmployeeCrudRepo empCrud;
	
	// @RequestMapping(path="/code",method = RequestMethod.GET)
	@GetMapping("/viewemployees")
	public List<Employee> getAllEmployees(){
		return empCrud.findAll();
	}
	
	@PostMapping("/addemployee")
	public Employee addEmployee()
	{
		Employee empObj = new Employee();
		empObj.setId(8L);
		empObj.setName("TEST USER");
		
		empCrud.save(empObj);
		
		return empObj;
	}
	
	@PostMapping("/addemployeePost")
	public Employee addEmployeebyPostMan(Employee empObj)
	{
		empCrud.save(empObj);		
		return empObj;
	}
	
	
}  