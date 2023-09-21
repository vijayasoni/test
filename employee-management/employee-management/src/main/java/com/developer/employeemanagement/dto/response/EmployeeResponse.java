package com.developer.employeemanagement.dto.response;
import java.io.Serializable;
import java.util.Date;
public class EmployeeResponse  implements Serializable {
	 private Long id;
	    private String name;
	    private String sex;
	    private Date DOB;
	    private String address;
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

	    public String getaddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        address = address;
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
