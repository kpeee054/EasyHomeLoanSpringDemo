package com.dbs.homeloan.entity;

import org.springframework.http.HttpStatus;

public class GenericResponse {
	private HttpStatus httpStatus;
	private String errorMessage;
	private Object body;
	
	public GenericResponse() {
		
	}
	
	public GenericResponse(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	public GenericResponse(HttpStatus httpStatus, Object body) {
		this.httpStatus = httpStatus;
		this.body = body;
	}
	
	public GenericResponse(HttpStatus httpStatus, String errorMessage) {
		this.httpStatus = httpStatus;
		this.errorMessage = errorMessage;
	}
	
	public GenericResponse(HttpStatus httpStatus, Object body, String errorMessage) {
		this.httpStatus = httpStatus;
		this.body = body;
		this.errorMessage = errorMessage;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}
}
