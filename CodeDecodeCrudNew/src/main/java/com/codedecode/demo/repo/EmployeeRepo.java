package com.codedecode.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.codedecode.demo.entity.Employee;

@Repository

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	
	@Procedure("CITY_SEARCH_TEST")
	String isCityFoundFromCityCode(String rama);
}
