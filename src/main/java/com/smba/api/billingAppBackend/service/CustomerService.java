package com.smba.api.billingAppBackend.service;

import java.util.List;

import com.smba.api.billingAppBackend.model.Customer;

public interface CustomerService {
	Customer saveCustomer(Customer customer);
	
	List<Customer> getAllCustomers();
	
	Customer getCustomer(Long id);
}
