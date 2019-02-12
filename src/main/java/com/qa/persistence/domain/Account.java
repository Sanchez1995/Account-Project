package com.qa.persistence.domain;

public class Account {
	private String firstName;
	private String lastName;
	private Long id;
	private String accountNum;
	
	public Account() { 
		
	}
	
	public Account(String firstName, String lastName, Long id, String accountNum) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNum = accountNum;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	// A comment

}
