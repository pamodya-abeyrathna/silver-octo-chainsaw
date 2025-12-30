package lk.zerocode.banking_api.service.impl;

import lk.zerocode.banking_api.controller.request.CreateAccountRequest;
import lk.zerocode.banking_api.db.Database;
import lk.zerocode.banking_api.exception.AccountNotCreatedException;
import lk.zerocode.banking_api.model.Account;
import lk.zerocode.banking_api.service.AccountService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
@Primary
public class AccountServiceImpl implements AccountService {

    @Override

    public Account create(CreateAccountRequest request) throws AccountNotCreatedException {
        //System.out.println("Account created");
        //return null;

        if(request.getBalance()<0){
            throw new AccountNotCreatedException("Account not Created!");
        }


        Account a1=new Account();

        a1.setAccountId("080020085681");
        a1.setBalance(23900.00);


        Database db1=new Database();

        db1.addAccount("080020085681",a1);

        System.out.println(db1.getAccountCount());

        return null;







    }

    /*public void deposit(Account a, Float amount) {

        if(amount<0){
            throw new AccountNotCreatedException("Can not Deposit! ");
        }



    }

    public void withdraw(){

    }*/
}
