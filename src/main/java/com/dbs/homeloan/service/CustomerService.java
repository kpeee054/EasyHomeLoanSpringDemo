package com.dbs.homeloan.service;

import com.dbs.homeloan.entity.Customer;

public interface CustomerService {
	
	public Customer findByCustId(Long custId);
	public Customer findByCustomerName(String customerName);
}
