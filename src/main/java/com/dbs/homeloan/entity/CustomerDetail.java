package com.dbs.homeloan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="customerdetail")
public class CustomerDetail {

	@Id
    @Column(name="customerdetail_id")
    private Long customerDetailId;
	
    @Column(name="cust_id")
    private Integer custId;
     
    @Column(name="first_name")
    private String firstName;
     
    @Column(name="last_name")
    private String lastName;
     
    @Column(name="email")
    private String email;
    
    @Column(name="mobile_num")
    private String mobileNum;
    
    @Column(name="age")
    private Integer age;
     
    @Column(name="monthly_sal")
    private Double monthlySal;
     
    @Column(name="cibil_score")
    private String cibilScore;
    
    @Column(name="relationship_year")
    private Integer relationshipYear;
    
    @Transient
    private Double preApprovedLoan;

	public Long getCustomerDetailId() {
		return customerDetailId;
	}

	public void setCustomerDetailId(Long customerDetailId) {
		this.customerDetailId = customerDetailId;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getMonthlySal() {
		return monthlySal;
	}

	public void setMonthlySal(Double monthlySal) {
		this.monthlySal = monthlySal;
	}

	public String getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(String cibilScore) {
		this.cibilScore = cibilScore;
	}

	public Integer getRelationshipYear() {
		return relationshipYear;
	}

	public void setRelationshipYear(Integer relationshipYear) {
		this.relationshipYear = relationshipYear;
	}

	public Double getPreApprovedLoan() {
		return preApprovedLoan;
	}

	public void setPreApprovedLoan(Double preApprovedLoan) {
		this.preApprovedLoan = preApprovedLoan;
	}
}
