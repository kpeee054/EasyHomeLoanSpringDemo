package com.dbs.homeloan.service;

import java.util.List;

import com.dbs.homeloan.entity.Transaction;

public interface TransactionService {
	public List<Transaction> findAllTransactions();

}
