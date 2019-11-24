package com.dbs.homeloan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dbs.homeloan.entity.Transaction;


public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	
	@Query(value = "select TRAN_ID, AS_OF_DATE, ACCT_ID, TRAN_DATE, TRAN_CURR_CODE, TRAN_AMT, TRAN_DIRECTION, TRAN_DESC, LEDGER_BAL from TRANSACTION", nativeQuery = true)
    public List<Transaction> findAll();
}

