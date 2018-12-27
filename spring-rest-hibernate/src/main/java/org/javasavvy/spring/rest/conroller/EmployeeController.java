package org.javasavvy.spring.rest.conroller;

import java.util.List;

import org.javasavvy.spring.rest.dto.EmployeeDTO;
import org.javasavvy.spring.rest.dto.StatusDTO;
import org.javasavvy.spring.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired(required=true)
	private EmployeeService employeeService;

	@GetMapping(value="/{empId}",produces={MediaType.APPLICATION_JSON_VALUE})
	public EmployeeDTO getEmployee(@PathVariable("empId") long empId){
		System.out.println("calling get Employee method");
		return employeeService.getEmployee(empId);
		
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST,consumes={MediaType.APPLICATION_JSON_VALUE},produces={MediaType.APPLICATION_JSON_VALUE})
	public  EmployeeDTO addEmployee(@RequestBody EmployeeDTO emp){
		
		System.out.println("calling add employee  method"+emp.getEmail());
		emp = employeeService.addEmployee(emp);
		return emp;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST,consumes={MediaType.APPLICATION_JSON_VALUE},produces={MediaType.APPLICATION_JSON_VALUE})
	public  EmployeeDTO updateEmployee(@RequestBody EmployeeDTO emp){
		
		if(emp.getEmpId()>0){
			emp = employeeService.addEmployee(emp);
		}else{
			//throw error here
		}
		return emp;
	}
	
	@GetMapping(value="/all",produces={MediaType.APPLICATION_JSON_VALUE})
	public List<EmployeeDTO> getAll(){
		return employeeService.getAllEmployees();
		
	}
	
		
	@GetMapping(value="/delete/{empId}",produces={MediaType.APPLICATION_JSON_VALUE})
	public StatusDTO deleteEmployee(@PathVariable("empId") long empId){
		
		employeeService.deleteEmployee(empId);
		StatusDTO status = new StatusDTO();
		status.setMessage("Employee Deleted Successfully");
		status.setStatus(200);
		return status;
		
	}
	
}
