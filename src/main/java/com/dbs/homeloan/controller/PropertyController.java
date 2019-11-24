package com.dbs.homeloan.controller;

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
import com.dbs.homeloan.entity.Property;
import com.dbs.homeloan.service.PropertyService;

@RestController
@RequestMapping("/property")
public class PropertyController {
	private static final Logger log = LoggerFactory.getLogger(PropertyController.class);
	@Autowired
    private PropertyService propertyService;
	
	@GetMapping("/getAll")
	public GenericResponse getAllProperties() {
		log.info("Request for getting all properties");
		List<Property> properties = propertyService.findAllProperties();
		
		return new GenericResponse(HttpStatus.OK, properties);
		
	}

}
