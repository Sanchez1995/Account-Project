package com.qa.persistence.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import javax.management.Query;

import com.qa.persistence.domain.Account;
import com.qa.util.*;

public class AccountMapRepository implements AccountRepository {

	private JSONUtil util = new JSONUtil();

	Map<Long, Account> accountMap = new HashMap<Long, Account>();

	// You must provide concrete implementation for each of these methods
	// do not change the method signature

	public String getAllAccounts() {
		return util.getGensonForObject(accountMap.values());

	}

	public String createAccount(String account) {
		Account aAccount = util.getObjectForGenson(account, Account.class);
		accountMap.put(aAccount.getId(), aAccount);
		return "Account Created";
	}

	public String deleteAccount(Long id) {
		accountMap.remove(id);
		return "Account has been deleted";
	}

	public String updateAccount(Long id, String account) {
		Account aAccount = util.getObjectForGenson(account, Account.class);
		accountMap.replace(id, aAccount);
		return "Account has been updated";
	}

}
