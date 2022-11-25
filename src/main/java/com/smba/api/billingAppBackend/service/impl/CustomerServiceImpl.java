package com.smba.api.billingAppBackend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smba.api.billingAppBackend.model.Customer;
import com.smba.api.billingAppBackend.repository.CustomerRepository;
import com.smba.api.billingAppBackend.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	
private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository= customerRepository;
	}
	
	
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomer(Long id) {
		return customerRepository.getById(id);
	}

}
