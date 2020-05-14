package com.hexa.service;
import java.util.ArrayList;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import com.hexa.repository.EmployeeRepository;
	import com.hexa.model.Employee;
	@Service
	public class EmployeeService {

		@Autowired
		EmployeeRepository er;
		
		public List<Employee> getAllEmployee() {
			List<Employee> Employee = new ArrayList<Employee>();
			er.findAll().forEach(Employee1 -> Employee.add(Employee1));
			return Employee;
		}
		public Employee getEmployeebyEmployeeId(int employeeId) {
			return er.findById(employeeId).get();
		}
		public void saveorupdate(Employee employee) {

			 er.save(employee);
		}
		public void delete(int employeeId) {
			er.deleteById(employeeId);
		}
		public void update(Employee employee,int employeeId) {
			er.save(employee);
		}
	}

