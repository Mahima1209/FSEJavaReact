package com.backend.contoller;


import com.backend.model.Account;
import com.backend.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/account")
public class accountController {

    @Autowired
    private accountService acctService;

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return  acctService.createAccount(account);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Optional<Account>> getAccountById(@PathVariable(value = "id") String accountId) {
        Optional<Account> account = acctService.getAccountById(accountId);
        return ResponseEntity.ok().body(account);
    }
}
