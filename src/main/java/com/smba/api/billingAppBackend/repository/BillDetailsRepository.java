package com.smba.api.billingAppBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smba.api.billingAppBackend.model.BillDetails;

@Repository
public interface BillDetailsRepository extends JpaRepository<BillDetails, Long>{

}
