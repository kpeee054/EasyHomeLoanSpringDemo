package com.dbs.homeloan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CUSTOMER")
public class Customer {
	
	@Id
    @Column(name="CUST_ID")
    private Long custId;
	
    @Column(name="CUSTOMER_NAME")
    private String customerName;
     
    @Column(name="CUST_SEX")
    private String custSex;
     
    @Column(name="ADDR1")
    private String address1;
     
    @Column(name="ADDR2")
    private String address12;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustSex() {
		return custSex;
	}

	public void setCustSex(String custSex) {
		this.custSex = custSex;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress12() {
		return address12;
	}

	public void setAddress12(String address12) {
		this.address12 = address12;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerName=" + customerName + ", custSex=" + custSex
				+ ", address1=" + address1 + ", address12=" + address12 + "]";
	}
}
