package com.dbs.homeloan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dbs.homeloan.entity.CustomerDetail;

public interface CustomerDetailRepository extends JpaRepository<CustomerDetail, Long> {
	
	@Query(value = "select c.customerdetail_id, c.cust_id, c.first_name, c.last_name, c.email, c.mobile_num, c.age, c.monthly_sal, c.cibil_score, c.relationship_year from customerdetail c where c.cust_id = :custId", nativeQuery = true)
    public CustomerDetail findByCustId(@Param("custId") Integer custId);
}
