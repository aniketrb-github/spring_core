package org.javasavvy.spring.services;

import java.util.List;

import org.javasavvy.spring.rest.dto.EmployeeDTO;


public interface EmployeeService {

	public EmployeeDTO addEmployee(EmployeeDTO emp);
	public EmployeeDTO updateEmployee(EmployeeDTO emp);
	public void deleteEmployee(long empId);
	public EmployeeDTO getEmployee(long empId);
	public List<EmployeeDTO> getAllEmployees();
}
