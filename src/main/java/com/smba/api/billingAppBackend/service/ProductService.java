package com.smba.api.billingAppBackend.service;

import java.util.List;
import java.util.Optional;

import com.smba.api.billingAppBackend.model.Product;

public interface ProductService {

    Product saveProduct(Product product);
    List<Product> getAllproductdetails();
    

}
