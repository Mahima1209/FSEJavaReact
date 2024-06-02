package com.backend.fse.contoller;



import com.backend.fse.model.Account;

import com.backend.fse.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/account")
public class accountController {

    @Autowired
    private accountService acctService;

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return  acctService.createAccount(account);
    }

    @PostMapping(value = "/{id}")
    public ResponseEntity<Optional<Account>> getAccountById(@PathVariable(value = "id") String accountId) {
        Optional<Account> account = acctService.getAccountById(accountId);
        return ResponseEntity.ok().body(account);
    }
}
