package com.developer.employeemanagement.dto.request;
import java.io.Serializable;
import java.util.Date;


public class EmployeeRequest  implements Serializable  {
	 private String name;
	    private String sex;
	    private Date DOB;
	    private String Address;
	    private String accountype;
	    private String contractype;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getsexr() {
	        return sex;
	    }

	    public void setGender(String sex) {
	        this.sex = sex;
	    }

	    public Date getDOB() {
	        return DOB;
	    }

	    public void setDateOfBirth(Date DOB) {
	        this.DOB= DOB;
	    }

	    public String getAddress() {
	        return Address;
	    }

	    public void setAddress(String address) {
	        Address = address;
	    }
	    
	    public String getaccountype() {
	        return accountype;
	    }

	    public void setaccountype(String accountype) {
	    	accountype = accountype;
	    }
	    
	    public String getcontractype() {
	        return contractype;
	    }

	    public void setcontractype(String contractype) {
	    	contractype = contractype;
	    }
	}




