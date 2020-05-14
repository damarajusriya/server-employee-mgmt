package com.hexa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hexa.model.Employee;
import com.hexa.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4202")
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;

	@GetMapping("/employee/all")
	private List<Employee> getAllEmployee() {
		 return es.getAllEmployee();
	}
	@GetMapping("/employee/{EmployeeId}")
	private Employee getByEmployeeId(@PathVariable("EmployeeId")int employeeId) {
		return es.getEmployeebyEmployeeId(employeeId);
}
	@DeleteMapping("/employee/delete/{EmployeeId}")
	private void delete(@PathVariable("EmployeeId") int employeeId) {
		es.delete(employeeId);
	}
	@PostMapping("/employee/new")
	private int saveorupdate(@RequestBody Employee employee) {
 System.out.println(employee);
		es.saveorupdate(employee);
		return employee.getEmployeeId();
		
//		return 0;
	}
	@PutMapping("/employee/edit/{EmployeeId}")
	private Employee update(@RequestBody Employee employee) {
		es.saveorupdate(employee);
		return employee;
	}
}
