package com.hexa.repository;
import org.springframework.data.repository.CrudRepository;
import com.hexa.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}