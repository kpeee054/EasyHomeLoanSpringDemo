package com.dbs.homeloan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.homeloan.entity.Customer;
import com.dbs.homeloan.repo.CustomerRepository;
import com.dbs.homeloan.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer findByCustId(Long custId) {
		return customerRepository.findByCustId(custId);
	}

	@Override
	public Customer findByCustomerName(String customerName) {
		return customerRepository.findByCustomerName(customerName);
	}
}
