package com.backend.service;

import com.backend.model.Account;

import java.util.Optional;

public interface accountService {
    Account createAccount(Account account);
    Optional<Account> getAccountById(String accountId);

}
