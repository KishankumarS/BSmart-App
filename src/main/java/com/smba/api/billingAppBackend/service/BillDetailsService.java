package com.smba.api.billingAppBackend.service;

import com.smba.api.billingAppBackend.model.BillDetails;

public interface BillDetailsService {

	BillDetails saveBillDetails(BillDetails billDetails);
	BillDetails updateBillDetails(BillDetails billDetails);
	BillDetails getBillDetails(Long billNo);
	
}
