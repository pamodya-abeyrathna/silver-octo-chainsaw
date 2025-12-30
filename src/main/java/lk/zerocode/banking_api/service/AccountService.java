package lk.zerocode.banking_api.service;

import lk.zerocode.banking_api.controller.request.CreateAccountRequest;
import lk.zerocode.banking_api.exception.AccountNotCreatedException;
import lk.zerocode.banking_api.model.Account;

public interface AccountService {


    public  Account create(CreateAccountRequest request) throws AccountNotCreatedException;






}
