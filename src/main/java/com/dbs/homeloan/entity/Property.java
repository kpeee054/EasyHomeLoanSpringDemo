package com.dbs.homeloan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROPERTY")
public class Property {
	
	@Id
    @Column(name="PROP_ID")
    private Long propId;
	
    @Column(name="PROP_NAME")
    private String propName;
     
    @Column(name="PROP_ADDR1")
    private String propAddr1;
     
    @Column(name="PROP_ADDR2")
    private String propAddr2;
     
    @Column(name="PROP_PRICE")
    private Long propPrice;
    
    @Column(name="PROP_AREA")
    private Integer propArea;
     
    @Column(name="PROP_TYPE")
    private String propType;

	public Long getPropId() {
		return propId;
	}

	public void setPropId(Long propId) {
		this.propId = propId;
	}

	public String getPropName() {
		return propName;
	}

	public void setPropName(String propName) {
		this.propName = propName;
	}

	public String getPropAddr1() {
		return propAddr1;
	}

	public void setPropAddr1(String propAddr1) {
		this.propAddr1 = propAddr1;
	}

	public String getPropAddr2() {
		return propAddr2;
	}

	public void setPropAddr2(String propAddr2) {
		this.propAddr2 = propAddr2;
	}

	public Long getPropPrice() {
		return propPrice;
	}

	public void setPropPrice(Long propPrice) {
		this.propPrice = propPrice;
	}

	public Integer getPropArea() {
		return propArea;
	}

	public void setPropArea(Integer propArea) {
		this.propArea = propArea;
	}

	public String getPropType() {
		return propType;
	}

	public void setPropType(String propType) {
		this.propType = propType;
	}

	@Override
	public String toString() {
		return "Property [propId=" + propId + ", propName=" + propName + ", propAddr1=" + propAddr1 + ", propAddr2="
				+ propAddr2 + ", propPrice=" + propPrice + ", propArea=" + propArea + ", propType=" + propType + "]";
	}

    
}
