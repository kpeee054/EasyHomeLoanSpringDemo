package com.dbs.homeloan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.homeloan.entity.CustomerDetail;
import com.dbs.homeloan.repo.CustomerDetailRepository;
import com.dbs.homeloan.service.CustomerDetailService;

@Service
public class CustomerDetailServiceImpl implements CustomerDetailService {

	@Autowired
	private CustomerDetailRepository customerDetailRepository;
	
	@Override
	public CustomerDetail getCustomerDetails(Integer custId) {
		return customerDetailRepository.findByCustId(custId);
	}

}
