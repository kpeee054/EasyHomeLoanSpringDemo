package com.dbs.homeloan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dbs.homeloan.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
 
	public Customer findByCustId(Long custId);
	
	@Query(value = "select c.CUST_ID, c.CUSTOMER_NAME, c.CUST_SEX, c.ADDR1, c.ADDR2  from CUSTOMER c where c.CUSTOMER_NAME = :customerName", nativeQuery = true)
    public abstract Customer findByCustomerName(@Param("customerName") String customerName);
}
