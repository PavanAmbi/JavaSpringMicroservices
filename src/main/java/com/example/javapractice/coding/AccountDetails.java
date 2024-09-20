package com.example.javapractice.coding;


import lombok.Data;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

public class AccountDetails {
    private static final Map<Account, String> accounts = new HashMap<>();
    static {
        accounts.put(new Account(100, 2000), "name2");
        accounts.put(new Account(300, 2000), "name5");
        accounts.put(new Account(90, 8000), "name8");
    }

    public static void main(String[] args) {
       // findAccountDetails(300);
        findAccountDetails2(90);
    }

    public static void findAccountDetails2(int accountNumber) {
        Account search = new Account(accountNumber, 0);

        Optional<Map.Entry<Account, String>> result = accounts.entrySet().stream().
                filter(acct -> acct.getKey().equals(search)).
                findFirst();
        result.ifPresent( acct->{System.out.println(acct.getKey().getAcctNumber());
            System.out.println(acct.getValue());});

    }

    public static void findAccountDetails(int acctNumber) {
        List<Map<Account, String>> listAccounts = new ArrayList<>();

        listAccounts.add(accounts);
        Map<Account, String> collect = listAccounts.stream().flatMap(accountStringMap ->
                        accountStringMap.entrySet().stream().
                                filter(entry -> entry.getKey().getAcctNumber() == acctNumber)).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}

@Data
@Getter
class Account{

    int acctNumber;
    long balance;

    public int getAcctNumber() {
        return acctNumber;
    }

    public Account(int acctNumber, long balance) {
        this.acctNumber = acctNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return acctNumber + " " + balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return acctNumber == account.acctNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(acctNumber);
    }
}

