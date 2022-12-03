package com.smba.api.billingAppBackend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smba.api.billingAppBackend.model.BillDetails;
import com.smba.api.billingAppBackend.repository.BillDetailsRepository;
import com.smba.api.billingAppBackend.service.BillDetailsService;

@Service
public class BillDetailsServiceImpl implements BillDetailsService {

	
private BillDetailsRepository billDetailsRepository;
	
	public BillDetailsServiceImpl(BillDetailsRepository billDetailsRepository) {
		super();
		this.billDetailsRepository= billDetailsRepository;
	}
	
	@Override
	public BillDetails saveBillDetails(BillDetails billDetails) {
		return billDetailsRepository.save(billDetails);
	}

	@Override
	public BillDetails updateBillDetails(BillDetails billDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BillDetails getBillDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BillDetails> getBilldetailsforABill(String billNo) {
		return billDetailsRepository.findByBillNo(billNo);
	}

}
