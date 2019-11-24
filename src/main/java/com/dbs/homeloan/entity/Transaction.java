package com.dbs.homeloan.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRANSACTION")
public class Transaction {
	
	@Id
    @Column(name="TRAN_ID")
    private Long tranId;
	
    @Column(name="AS_OF_DATE")
    private Date asOfDate;
     
    @Column(name="ACCT_ID")
    private String acctId;
     
    @Column(name="TRAN_DATE")
    private Date tranDate;

    @Column(name="TRAN_CURR_CODE")
    private String tranCurrCode;
     
    @Column(name="TRAN_AMT")
    private BigDecimal tranAmt;
     
    @Column(name="TRAN_DIRECTION")
    private String tranDirection;
    
    @Column(name="TRAN_DESC")
    private String tranDesc;
     
    @Column(name="LEDGER_BAL")
    private BigDecimal ledgerBal;

	public Long getTranId() {
		return tranId;
	}

	public void setTranId(Long tranId) {
		this.tranId = tranId;
	}

	public Date getAsOfDate() {
		return asOfDate;
	}

	public void setAsOfDate(Date asOfDate) {
		this.asOfDate = asOfDate;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public Date getTranDate() {
		return tranDate;
	}

	public void setTranDate(Date tranDate) {
		this.tranDate = tranDate;
	}

	public String getTranCurrCode() {
		return tranCurrCode;
	}

	public void setTranCurrCode(String tranCurrCode) {
		this.tranCurrCode = tranCurrCode;
	}

	public BigDecimal getTranAmt() {
		return tranAmt;
	}

	public void setTranAmt(BigDecimal tranAmt) {
		this.tranAmt = tranAmt;
	}

	public String getTranDirection() {
		return tranDirection;
	}

	public void setTranDirection(String tranDirection) {
		this.tranDirection = tranDirection;
	}

	public String getTranDesc() {
		return tranDesc;
	}

	public void setTranDesc(String tranDesc) {
		this.tranDesc = tranDesc;
	}

	public BigDecimal getLedgerBal() {
		return ledgerBal;
	}

	public void setLedgerBal(BigDecimal ledgerBal) {
		this.ledgerBal = ledgerBal;
	}

	@Override
	public String toString() {
		return "Transaction [tranId=" + tranId + ", asOfDate=" + asOfDate + ", acctId=" + acctId + ", tranDate="
				+ tranDate + ", tranCurrCode=" + tranCurrCode + ", tranAmt=" + tranAmt + ", tranDirection=" + tranDirection
				+ ", tranDesc=" + tranDesc + ", ledgerBal=" + ledgerBal + "]";
	}
}
