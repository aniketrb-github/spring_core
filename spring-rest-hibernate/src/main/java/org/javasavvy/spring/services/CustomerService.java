package org.javasavvy.spring.services;

import java.util.List;

import org.javasavvy.spring.entity.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer getCustomer(long customerId);
	public List<Customer> getAllCustomers();
	public  void deleteCustomer(long customerId);
}
