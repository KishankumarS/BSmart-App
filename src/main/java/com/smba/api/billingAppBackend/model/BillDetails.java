package com.smba.api.billingAppBackend.model;

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
@Table(name="BillDetails")
public class BillDetails {

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
	public String getSp() {
		return sp;
	}
	public void setSp(String sp) {
		this.sp = sp;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getMrp() {
		return mrp;
	}
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}
	public String getTotalmrp() {
		return totalmrp;
	}
	public void setTotalmrp(String totalmrp) {
		this.totalmrp = totalmrp;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getAmoutPayable() {
		return amountPayable;
	}
	public void setAmoutPayable(String amountPayable) {
		this.amountPayable = amountPayable;
	}
	public String getTotalItemCost() {
		return totalItemCost;
	}
	public void setTotalItemCost(String totalItemCost) {
		this.totalItemCost = totalItemCost;
	}
	public String getCustomerMobile() {
		return customerMobile;
	}
	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName; 
	}
	@Column(name = "bill_no")
	private String billNo;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "billedDate")
	private Date billedDate;
	private String sp;
	private String qty;
	private String product_name;
	private String mrp;
	private String totalmrp;
	private String discount;
	private String amountPayable;
	private String totalItemCost;
	private String customerMobile;
	private String customerName;
	
	
	
}
