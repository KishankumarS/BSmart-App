package com.smba.api.billingAppBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smba.api.billingAppBackend.model.Customer;
import com.smba.api.billingAppBackend.repository.CustomerRepository;
import com.smba.api.billingAppBackend.service.CustomerService;

@CrossOrigin(origins = "http://localhost:19006", allowedHeaders = "Requestor-Type", exposedHeaders = "X-Get-Header")
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	private CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		super();
	 this.customerService = customerService;
	}
	
	@Autowired
	CustomerRepository customerRepository;
	
	@CrossOrigin
	@PostMapping(value = "/", consumes = {"application/json"})
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
		return new ResponseEntity<Customer>(customerService.saveCustomer(customer),HttpStatus.CREATED);
	}
	
	@CrossOrigin
	@GetMapping
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
		
	}
	
	@CrossOrigin
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable("id")Long id){
		return customerService.getCustomer(id);
		
	}
}
