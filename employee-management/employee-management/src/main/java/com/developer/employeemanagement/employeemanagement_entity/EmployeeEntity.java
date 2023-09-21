package com.developer.employeemanagement_entity;

import java.util.Date;

//import javax.annotation.processing.Generated;

import jakarta.persistence.*;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Table;
//import jakarta.persistence.Id;
@Entity
@Table(name="employeetable")

public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="sex")
	private String sex;
	
	@Column(name="DOB")
	private Date DOB;
	
	@Column(name="address")
	private String address;
	
	@Column(name="accountype")
	private String accountype;
	
	@Column(name="contractype")
	private String contractype;
	
	public EmployeeEntity(Long id, String name, String sex, Date dOB, String address, String accountype,
			String contractype) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		DOB = dOB;
		this.address = address;
		this.accountype = accountype;
		this.contractype = contractype;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccountype() {
		return accountype;
	}
	public void setAccountype(String accountype) {
		this.accountype = accountype;
	}
	public String getContractype() {
		return contractype;
	}
	public void setContractype(String contractype) {
		this.contractype = contractype;
	}

}
