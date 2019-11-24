package com.dbs.homeloan.service;

import org.springframework.stereotype.Service;

import com.dbs.homeloan.entity.CustomerDetail;

@Service
public interface CustomerDetailService {
	public CustomerDetail getCustomerDetails(Integer custId);
}
