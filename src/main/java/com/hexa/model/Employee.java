package com.hexa.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@Column(name="EmployeeId")
    private int EmployeeId;
	
	public Employee() {
    }
	
	public Employee(int employeeId, String employeeName, String employeeDesignation) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeDesignation = employeeDesignation;
	}
	
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeDesignation="
				+ EmployeeDesignation + "]";
	}
	
	@Column(name="EmployeeName")
	private String EmployeeName;
	
	@Column(name="EmployeeDesignation")
	private String EmployeeDesignation;
	
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeDesignation() {
		return EmployeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		EmployeeDesignation = employeeDesignation;
	}
}