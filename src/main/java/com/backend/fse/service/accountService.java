package com.backend.fse.service;


import com.backend.fse.model.Account;

import java.util.Optional;

public interface accountService {
    Account createAccount(Account account);
    Optional<Account> getAccountById(String accountId);

}
