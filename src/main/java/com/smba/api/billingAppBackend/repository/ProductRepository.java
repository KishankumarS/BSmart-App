package com.smba.api.billingAppBackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smba.api.billingAppBackend.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	@Query(value = "Select * from product e where e.productid=:productid", nativeQuery = true)
	List<Product> findByIds(@Param("productid") Integer productid);
}
