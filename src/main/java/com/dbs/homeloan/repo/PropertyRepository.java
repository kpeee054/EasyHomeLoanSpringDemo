package com.dbs.homeloan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dbs.homeloan.entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {

	@Query(value = "select PROP_ID, PROP_NAME, PROP_ADDR1, PROP_ADDR2, PROP_PRICE, PROP_AREA, PROP_TYPE from PROPERTY", nativeQuery = true)
    public List<Property> findAll();
}
