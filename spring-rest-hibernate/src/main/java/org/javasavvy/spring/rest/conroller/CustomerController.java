package org.javasavvy.spring.rest.conroller;

import java.util.List;


import org.apache.log4j.Logger;
import org.javasavvy.spring.entity.Customer;
import org.javasavvy.spring.rest.dto.StatusDTO;
import org.javasavvy.spring.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	Logger  LOG = Logger.getLogger(CustomerController.class.getName());
	
	@Autowired(required=true)
	@Qualifier("customerService")
	private CustomerService customerService;
	
	@GetMapping("/{customerId}")
	public Customer getCustomers(@PathVariable("customerId") long customerId){
		
		return customerService.getCustomer(customerId);
	}
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Customer> allCustomers(){
		List<Customer> list = customerService.getAllCustomers();
		return list;
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public Customer editCustomer(@RequestBody Customer customer){
		 customer = customerService.updateCustomer(customer);
		return customer;
		
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Customer addCustomer(@RequestBody Customer customer){
	    customer = customerService.addCustomer(customer);
		return customer;
	}
	
	@RequestMapping(value="/delete/{customerId}",method=RequestMethod.GET)
	public StatusDTO delete(@PathVariable("customerId") long customerId){
	   
		customerService.deleteCustomer(customerId);
		StatusDTO status = new StatusDTO();
		status.setMessage("Customer Deleted Successfully");
		status.setStatus(200);
		return status;
	}
	
}
