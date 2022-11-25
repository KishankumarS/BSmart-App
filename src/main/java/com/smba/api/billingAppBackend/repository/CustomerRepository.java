package com.smba.api.billingAppBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smba.api.billingAppBackend.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
