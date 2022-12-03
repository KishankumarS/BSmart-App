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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smba.api.billingAppBackend.model.BillDetails;
import com.smba.api.billingAppBackend.model.Inventory;
import com.smba.api.billingAppBackend.model.Product;
import com.smba.api.billingAppBackend.repository.BillDetailsRepository;
import com.smba.api.billingAppBackend.service.BillDetailsService;

@RestController
@RequestMapping("/api/billDetails")
public class BillDetailsController {
	private BillDetailsService billDetailsService;
	
	public BillDetailsController(BillDetailsService billDetailsService) {
		super();
		this.billDetailsService = billDetailsService;
	}
	
	@Autowired
	BillDetailsRepository billDetailsRepository;
	
	@CrossOrigin
	@PostMapping(value = "/", consumes = {"application/json"})
	public ResponseEntity<BillDetails> saveBillDetails(@RequestBody List<BillDetails> billDetails){
		return new ResponseEntity<BillDetails>(HttpStatus.CREATED);	
	}
	
	@CrossOrigin
	@GetMapping
	public BillDetails getBillDetails(){
		return billDetailsService.getBillDetails();
		
	}
	
	@SuppressWarnings("unchecked")
	@CrossOrigin
	@GetMapping("/billno")
	public ResponseEntity<List<BillDetails>> getAllbilldetailsforABill(@RequestParam String billNo) {
		return new ResponseEntity<List<BillDetails>>(billDetailsRepository.findByBillNo(billNo), HttpStatus.OK);
	}
}
