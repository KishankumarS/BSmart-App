package com.smba.api.billingAppBackend.service;

import java.util.List;

import com.smba.api.billingAppBackend.model.BillDetails;

public interface BillDetailsService {

	BillDetails saveBillDetails(BillDetails billDetails);
	BillDetails updateBillDetails(BillDetails billDetails);
	BillDetails getBillDetails();
	List<BillDetails> getBilldetailsforABill(String billNo);
	
}
