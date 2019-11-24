package com.dbs.homeloan.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.homeloan.entity.GenericResponse;
import com.dbs.homeloan.entity.Transaction;
import com.dbs.homeloan.service.TransactionService;
import com.dbs.homeloan.util.PGPUtil;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	private static final Logger log = LoggerFactory.getLogger(TransactionController.class);
	@Autowired
    private TransactionService transactionService;
	
	@GetMapping("/getAll")
	public GenericResponse getAllTransactions() {
		log.info("Request for getting all Transactions");
		List<Transaction> transactionList = new ArrayList<>();
		List<Transaction> transactions = transactionService.findAllTransactions();
		if (transactions != null && !transactions.isEmpty()) {
			int transactionListSize = transactions.size();
			for (int i = 0; i < transactionListSize; i++) {
				Transaction transaction = transactions.get(i);
				if (transaction.getAcctId() != null && !transaction.getAcctId().isEmpty()) {
					transaction.setAcctId(PGPUtil.decrypt(transaction.getAcctId()));
					transactionList.add(transaction);
				}
			}
		}
		return new GenericResponse(HttpStatus.OK, transactionList);
	}
}
