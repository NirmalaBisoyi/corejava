package com.codedecode.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.demo.entity.Employee;
import com.codedecode.demo.repo.EmployeeRepo;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepo emprepo;

	@GetMapping("/getemployees")
	public List<Employee> getAllEmployee() {
		System.out.println("getting all employees");
		return emprepo.findAll();
	}
	
	@GetMapping("/emp/{empid}")
	public Employee getEmployeeById(@PathVariable Long empid ){
		return emprepo.findById(empid).get();
		
	}

	@PostMapping("/addhere")
	public Employee addEmployee() {

		Employee obj1 = new Employee();
		obj1.setId(2L);
		obj1.setName("Nirmala");
		emprepo.save(obj1);
		return obj1;
	}

	@PostMapping("/addfrompostman")
	public List<Employee> addEmployeePostman(@RequestBody List<Employee> objlist) {
		
		for (Object newEmp:objlist) {
			 emprepo.save((Employee) newEmp);
		 }
		//emprepo.saveAll(objlist);
		return objlist;
	}

		
	//@DeleteMapping("/deleteemployee")
	//public void deleteEmployee() {
	//	emprepo.deleteById((long) 12);	
	//}
	
	@DeleteMapping("/delete/{empid1}")
	public void deleteEmployeePostman(@PathVariable Long empid1) {		
		emprepo.deleteById(empid1);
	}
	
	@PutMapping("/updateemployee")
	public Employee updateEmployeePostman(@RequestBody Employee emp) {
		emprepo.save(emp);
		return emp;
	}
		
	@PutMapping("/updateemployeeList")
	public List<Employee> updateEmployeePostman(@RequestBody List<Employee> empList) {
		emprepo.saveAll(empList);
		return empList;
	}

	@GetMapping("/findcity/{bhima}")
	public String isCityFound(@PathVariable String bhima ){
		String returnValue = emprepo.isCityFoundFromCityCode(bhima); 
		return returnValue;
	}
}
