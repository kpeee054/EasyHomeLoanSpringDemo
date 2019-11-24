package com.dbs.homeloan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.homeloan.entity.Customer;
import com.dbs.homeloan.entity.GenericResponse;
import com.dbs.homeloan.service.CustomerService;

@RestController
@RequestMapping("/login")
public class LoginController {
	private static final Logger log = LoggerFactory.getLogger(LoginController.class);
	@Autowired
    private CustomerService customerService;
	
	@GetMapping("/validateCustomer/{customerName}")
	public GenericResponse validateCustomer(@PathVariable String customerName) {
		log.info("Request for valiating customer");
		if (customerName != null) {
			Customer customer = customerService.findByCustomerName(customerName);
			if (customer != null) {
				log.info("Valied Customer");
				return new GenericResponse(HttpStatus.OK, customer, null);
			} else {
				log.error("Invalied Customer");
				return new GenericResponse(HttpStatus.NOT_FOUND, "Invalied Customer");
			}
		} else {
			log.error("Invalied request for validaing customer");
			return new GenericResponse(HttpStatus.BAD_REQUEST, "Invalied Request");
		}
	}
}
