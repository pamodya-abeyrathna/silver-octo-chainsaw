package lk.zerocode.banking_api.controller;

import lk.zerocode.banking_api.controller.request.CreateAccountRequest;
import lk.zerocode.banking_api.exception.AccountNotCreatedException;
import lk.zerocode.banking_api.model.Account;
import lk.zerocode.banking_api.service.AccountService;
import lk.zerocode.banking_api.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {



    @Autowired
    private AccountService accountService;

    private AccountServiceImpl accountServiceimpl;


    @PostMapping(value="/accounts")
    public void createAccount(@RequestBody CreateAccountRequest car) throws AccountNotCreatedException {

        System.out.println("Account created");

        System.out.println(car.getAccNo());
        System.out.println(accountService.create(car));


    }

    @GetMapping(value="/accounts")
    public void getAccount()
    {

    }

    @PostMapping(value="/accounts/{account-id}")
    public void createAccount(@PathVariable("account-id")Long accountId)
    {

    }

    /*@PostMapping(value="/accounts/{account-id}/deposits")
    public void createAccount(@PathVariable("account-id")Long accountId)
    {

    }*/

    @GetMapping(value="/accounts/{account-id}")
    public void getAccount(@PathVariable("account-id")Long accountId)
    {

    }





}
