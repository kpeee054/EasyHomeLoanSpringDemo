package com.dbs.homeloan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.homeloan.entity.Property;
import com.dbs.homeloan.repo.PropertyRepository;
import com.dbs.homeloan.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	private PropertyRepository propertyRepository;

	@Override
	public List<Property> findAllProperties() {
		return propertyRepository.findAll();
	}
}
