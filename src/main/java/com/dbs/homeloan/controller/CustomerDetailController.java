package com.dbs.homeloan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.homeloan.entity.CustomerDetail;
import com.dbs.homeloan.entity.GenericResponse;
import com.dbs.homeloan.service.CustomerDetailService;
import com.dbs.homeloan.util.PGPUtil;

@RestController
@RequestMapping("/customerdetail")
public class CustomerDetailController {
	private static final Logger log = LoggerFactory.getLogger(CustomerDetailController.class);
	
	@Autowired
    private CustomerDetailService customerDetailService;
	
	@GetMapping("/preapprovedloan/{custId}")
	public GenericResponse preApprovedLoan(@PathVariable Integer custId) {
		log.info("Request for fetching pre-approved loan");
		CustomerDetail customerDetail = new CustomerDetail();
		if (custId != null) {
			customerDetail = customerDetailService.getCustomerDetails(custId);
			if (customerDetail.getEmail() != null && !customerDetail.getEmail().isEmpty()) {
				customerDetail.setEmail(PGPUtil.decrypt(customerDetail.getEmail()));
			}
			if (customerDetail.getMobileNum() != null && !customerDetail.getMobileNum().isEmpty()) {
				customerDetail.setMobileNum(PGPUtil.decrypt(customerDetail.getMobileNum()));
			}
			if (customerDetail.getCibilScore() != null && !customerDetail.getCibilScore().isEmpty()) {
				customerDetail.setCibilScore(PGPUtil.decrypt(customerDetail.getCibilScore()));
			}
			
			if (customerDetail.getAge() != null 
					&& customerDetail.getAge() > 22 
					&& customerDetail.getAge() < 50 
					&& customerDetail.getCibilScore() != null 
					&& Integer.parseInt(customerDetail.getCibilScore()) > 700 
					&& Integer.parseInt(customerDetail.getCibilScore()) < 1000 
					&& customerDetail.getRelationshipYear() != null 
					&& customerDetail.getRelationshipYear() > 2) {
						Double monthlySalary = customerDetail.getMonthlySal();
						Double preApprovedLoan = monthlySalary * 10;
						customerDetail.setPreApprovedLoan(preApprovedLoan);
						log.info("Pre-approved loan is : " +preApprovedLoan);
				} else {
					log.error("Customer is not eligible for per-approved loan");
				}
			return new GenericResponse(HttpStatus.OK, customerDetail, null);
		} else {
			log.error("Invalied request for getting per-approved loan");
			return new GenericResponse(HttpStatus.BAD_REQUEST, "Invalied Request");
		}
	}
}
