package com.qa.MapTests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.owlike.genson.Genson;
import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountMapRepository;

public class AccountServiceTest {

	private AccountMapRepository acc = new AccountMapRepository();

	private static final String MOCK_OBJECT1 = "{\"id\": 1, \"account_number\": \"12\", \"first_name\": \"g\", \"last_name\": \"h\"}";
	private static final String MOCK_OBJECT2 = "{\"id\": 1, \"account_number\": \"12\", \"first_name\": \"g\", \"last_name\": \"h\"}";
	private static final String MOCK_OBJECT3 = "{\"id\": 1, \"account_number\": \"12\", \"first_name\": \"g\", \"last_name\": \"h\"}";

	@Before
	public void setup() {
		acc = new AccountMapRepository();

	}

	@Test
	public void addAccountTest() {
		String reply = acc.createAccount(MOCK_OBJECT1);
		Assert.assertEquals(reply, "Account Created");

	}

	@Test
	
	public void getCountForFirstNamesInAccountWhenZeroOccurances() {
		String reply1 = acc.createAccount(MOCK_OBJECT1);
		String reply2 = acc.createAccount(MOCK_OBJECT2);
		String reply3 = acc.createAccount(MOCK_OBJECT3);
		Assert.assertEquals(0, acc.cycleAccount("john"));	
	}

	@Test
	@Ignore
	public void getCountForFirstNamesInAccountWhenOne() {
		// For a later piece of functionality
		fail("TODO");
	}

	@Test
	@Ignore
	public void getCountForFirstNamesInAccountWhenTwo() {
		// For a later piece of functionality
		fail("TODO");
	}

	@Test
	@Ignore
	public void add2AccountsTest() {
		fail("TODO");
	}

	@Test
	@Ignore
	public void removeAccountTest() {
		fail("TODO");
	}

	@Test
	@Ignore
	public void remove2AccountsTest() {
		fail("TODO");
	}

	@Test
	@Ignore
	public void remove2AccountTestAnd1ThatDoesntExist() {
		fail("TODO");
	}

	@Test
	@Ignore
	public void jsonStringToAccountConversionTest() {
		// testing JSONUtil
		fail("TODO");
	}

	@Test
	@Ignore
	public void accountConversionToJSONTest() {
		// testing JSONUtil
		fail("TODO");
	}

}
