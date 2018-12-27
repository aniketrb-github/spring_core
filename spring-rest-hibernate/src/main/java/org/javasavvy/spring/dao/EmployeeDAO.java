package org.javasavvy.spring.dao;

import java.util.List;

import org.javasavvy.spring.entity.Employee;


public interface EmployeeDAO {

	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee getEmployee(long empId);
	public List<Employee> getAllEmployees();
}
