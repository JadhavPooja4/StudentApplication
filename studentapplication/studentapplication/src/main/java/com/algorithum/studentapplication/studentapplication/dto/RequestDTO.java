package com.algorithum.studentapplication.studentapplication.dto;

import java.util.Map;

public class RequestDTO {
	
	Map<String,?> request;

	public RequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RequestDTO [request=" + request + ", getRequest()=" + getRequest() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public RequestDTO(Map<String, ?> request) {
		super();
		this.request = request;
	}

	public Map<String, ?> getRequest() {
		return request;
	}

	public void setRequest(Map<String, ?> request) {
		this.request = request;
	}

	
	
	
	

}
