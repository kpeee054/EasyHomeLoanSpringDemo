package com.dbs.homeloan.entity;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.dbs.homeloan.dao.impl.Details;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
public class LoanEntity {
	private HttpStatus status;
	private String errorMessage;
	private List<Details> body;
	
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<Details> getBody() {
		return body;
	}
	public void setBody(List<Details> body) {
		this.body = body;
	}
		
}
