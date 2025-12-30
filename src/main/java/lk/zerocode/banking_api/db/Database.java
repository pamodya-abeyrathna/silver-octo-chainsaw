package lk.zerocode.banking_api.db;

import lk.zerocode.banking_api.model.Account;

import java.util.HashMap;
import java.util.Map;

public class Database {

    static Map<String, Account> accounts=new HashMap<>();

    static public void addAccount(String accNo, Account account){

        accounts.put(accNo,account);


    }

    static public int getAccountCount(){

        return accounts.size();


    }


}
