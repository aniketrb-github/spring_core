package org.javasavvy.spring.services;

import java.util.List;

import org.javasavvy.spring.dao.CustomerDAO;
import org.javasavvy.spring.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired(required=true)
	@Qualifier("customerDAO")
	private CustomerDAO customerDAO;
	
	@Transactional
	public Customer addCustomer(Customer customer) {
		
		System.out.println("Cusomer Service create invoked:"+customer.getCustomerName());
		customer = customerDAO.addCustomer(customer);
		return customer;
	}
	@Transactional
	public Customer updateCustomer(Customer customer) {
		
		System.out.println("Cusomer Service Update invoked:"+customer.getCustomerName());
		customer = customerDAO.updateCustomer(customer);
		return customer;
	}

	public Customer getCustomer(long customerId) {
		return customerDAO.getCustomer(customerId);
	}

	public List<Customer> getAllCustomers() {
		return customerDAO.getCustomers();
	}
	@Transactional
	public void deleteCustomer(long customerId) {
		customerDAO.deleteCustomer(customerId);
	}


}
