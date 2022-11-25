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

import com.smba.api.billingAppBackend.model.Product;
import com.smba.api.billingAppBackend.repository.ProductRepository;
import com.smba.api.billingAppBackend.service.ProductService;


@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@Autowired
	ProductRepository productRepo;
	
	@CrossOrigin
	@PostMapping(value = "/", consumes = {"application/json"})
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
			return new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.CREATED);
	}
	
	@CrossOrigin
	@GetMapping
	public List<Product> getAllproductdetails(){
		return productService.getAllproductdetails();	
	}
	
	@CrossOrigin
	@GetMapping("/{productid}")
	public List<Product> getAllproductdetailsforAProduct(@PathVariable("productid") Integer productid) {
		System.out.println("productid: "+productid);
		return productRepo.findByIds(productid);		
	}
}
