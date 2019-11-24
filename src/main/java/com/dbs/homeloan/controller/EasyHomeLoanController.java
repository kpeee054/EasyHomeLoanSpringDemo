package com.dbs.homeloan.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.homeloan.dao.customer.EmiDetails;
import com.dbs.homeloan.dao.impl.Details;
import com.dbs.homeloan.entity.LoanEntity;


@RestController
@Path("/")
public class EasyHomeLoanController {
	
	@Autowired
	private LoanEntity loanEntity;
	
	@GetMapping("/emiCaluclator/{years}")
	public LoanEntity emiCaluclator(@PathVariable int years) {
		loanEntity.setStatus(HttpStatus.OK);
		loanEntity.setErrorMessage("");
		
		LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formmat1 = DateTimeFormatter.ofPattern("dd-MM-YYYY", Locale.ENGLISH);
        String formatter = formmat1.format(ldt);
        
        double pAmount = 100000.00;
        double rate =8.75 ;
        rate = rate/(12*100); 
        years = years*12; 

        List<Details> list = new ArrayList<>();
        double emi= (pAmount*rate*Math.pow(1+rate,years))/(Math.pow(1+rate,years)-1);
        double totalEmi = years * emi;
        for (int i=1;i<=years;i++) {
        	EmiDetails emiDetails = new EmiDetails();
        	ldt = ldt.plusMonths(1);
        	formatter = formmat1.format(ldt);
        	emiDetails.setDate(formatter);
        	double amount = i*emi;
        	emiDetails.setEmi(emi);
        	emiDetails.setPrincipalAmount(pAmount);
        	emiDetails.setInterest(amount);
        	double balance = totalEmi - amount;
        	emiDetails.setBalance(balance);
        	list.add(emiDetails);
        }
		loanEntity.setBody(list);
		return loanEntity;
	}
	
	

}
