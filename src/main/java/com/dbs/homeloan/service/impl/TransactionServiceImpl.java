package com.dbs.homeloan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.homeloan.entity.Transaction;
import com.dbs.homeloan.repo.TransactionRepository;
import com.dbs.homeloan.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public List<Transaction> findAllTransactions() {
		return transactionRepository.findAll();
	}

}
