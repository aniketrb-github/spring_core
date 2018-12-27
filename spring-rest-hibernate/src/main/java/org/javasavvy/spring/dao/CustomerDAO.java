package org.javasavvy.spring.dao;

import java.util.List;

import org.javasavvy.spring.entity.Customer;

public interface CustomerDAO {
	
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public void deleteCustomer(long customerId);
	public Customer getCustomer(long customerId);
	public List<Customer> getCustomers();

}
