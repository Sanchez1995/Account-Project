package com.qa.persistence.domain;

public class Account {
	private String firstName;
	private String lastName;
	private Long id;
	private String account;

	public Account(String firstName, String lastName, Long id, String account) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	// A comment

}
