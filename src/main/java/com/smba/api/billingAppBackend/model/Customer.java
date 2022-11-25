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

import lombok.Data;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true)	
	private String customer_name;
	public String getcustomer_name() {
		return customer_name;
	}
	public void setcustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getcustomer_mobile() {
		return customer_mobile;
	}
	public void setcustomer_mobile(String customer_mobile) {
		this.customer_mobile = customer_mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getno_of_bills() {
		return no_of_bills;
	}
	public void setno_of_bills(Integer no_of_bills) {
		this.no_of_bills = no_of_bills;
	}
	public String getstatus() {
		return status;
	}
	public void setstatus(String status) {
		this.status = status;
	}
	public Double gettotal_amount() {
		return total_amount;
	}
	public void settotal_amount(Double total_amount) {
		this.total_amount = total_amount;
	}
	@Column(unique = true)	
	private String customer_mobile;
	private String address;
	private Integer no_of_bills;
	private String status;
	private Double total_amount;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creationDate")
	private Date creationDate;
	
}
