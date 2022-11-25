package com.smba.api.billingAppBackend.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="statements")
public class Statements {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public Date getBilledDate() {
		return billedDate;
	}
	public void setBilledDate(Date billedDate) {
		this.billedDate = billedDate;
	}

	public String getTotalItemsInBill() {
		return totalItemsInBill;
	}
	public void setTotalItemsInBill(String totalItemsInBill) {
		this.totalItemsInBill = totalItemsInBill;
	}
	public String getTotalBillAmount() {
		return totalBillAmount;
	}
	public void setTotalBillAmount(String totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	private String billNo;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "billedDate")
	private Date billedDate;
	private String totalItemsInBill;
	private String totalQty;
	public String getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(String totalQty) {
		this.totalQty = totalQty;
	}
	private String totalBillAmount;
	private String customerName;
	
	private String getTime() {
			LocalDateTime myDateObj = LocalDateTime.now();   
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyMMdd/HHmmss");  
		    
		    return myDateObj.format(myFormatObj);  
	}
}
