package com.smba.api.billingAppBackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smba.api.billingAppBackend.model.Product;
import com.smba.api.billingAppBackend.repository.ProductRepository;
import com.smba.api.billingAppBackend.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productrepo;

	public ProductServiceImpl(ProductRepository productrepo) {
		super();
		this.productrepo = productrepo;
	}

	@Override
	public Product saveProduct(Product product) {
		return productrepo.save(product);
	}

	@Override
	public List<Product> getAllproductdetails() {
		return productrepo.findAll();
	}

}
