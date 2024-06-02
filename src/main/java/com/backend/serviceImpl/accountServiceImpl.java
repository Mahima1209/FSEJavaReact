package com.backend.serviceImpl;


import com.backend.model.Account;
import com.backend.repository.AccountRepository;
import com.backend.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class accountServiceImpl implements accountService {

    @Autowired
    private AccountRepository accountRepository;
    /**
     * @param account
     * @return
     */
    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    /**
     * @param accountId
     * @return
     */
    @Override
    public Optional<Account> getAccountById(String accountId) {
        return accountRepository.findById(accountId);
    }
}
