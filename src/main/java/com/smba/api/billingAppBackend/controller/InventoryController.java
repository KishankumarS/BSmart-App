package com.smba.api.billingAppBackend.controller;

import java.util.List;

import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smba.api.billingAppBackend.model.Inventory;
import com.smba.api.billingAppBackend.repository.InventoryRepository;
import com.smba.api.billingAppBackend.service.InventoryService;


@RestController
@RequestMapping("/api/productlist")
public class InventoryController  {
	
	@Autowired
	private InventoryService inventoryService;

	
	public InventoryController(InventoryService inventoryService) {
		super();
		this.inventoryService = inventoryService;
	}
	
	@Autowired
	InventoryRepository inventoryRepo;
	
	@CrossOrigin
	@PostMapping(value = "/", consumes = {"application/json"})
	public ResponseEntity<Inventory> saveInventory(@RequestBody Inventory inventory){
			return new ResponseEntity<Inventory>(inventoryService.saveInventory(inventory), HttpStatus.CREATED);
	}

	@CrossOrigin
	@PutMapping(value = "/update", consumes = {"application/json"})
	public ResponseEntity<Inventory> updateInventory(@RequestBody Inventory inventory){
			return new ResponseEntity<Inventory>(inventoryService.updateInventory(inventory), HttpStatus.CREATED);
	}
	
	@CrossOrigin
	@GetMapping
	public List<Inventory> getAllInventories(){
		return inventoryService.getAllInventories();
		
	}

	@PatchMapping(path = "/updateQty", consumes = "application/json")
	public ResponseEntity<Inventory> updateCustomer(@RequestBody Inventory inventory) {
	    	return new ResponseEntity<Inventory>(inventoryService.updateInventory(inventory), HttpStatus.OK);
	    
	}
}
