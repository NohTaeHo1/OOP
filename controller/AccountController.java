package controller;

import builder.AccountBuilder;
import model.AccountDTO;
import service.AccountService;
import serviceImpl.AccountServiceImpl;
import view.AccountView;

import java.util.List;
import java.util.Scanner;

public class AccountController {
    AccountService as;

    public AccountController() {
        this.as  = AccountServiceImpl.getInstance();
    }

    public String createAccount(Scanner sc) {
        return as.createAccount(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build()
                );
    }

    public String deposit(Scanner sc) {
        return as.deposit(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build()
        );

    }

    public String withdraw(Scanner sc) {
        return as.withdraw(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build()
        );
    }

    public String getBalance(Scanner sc) {
        return as.getBalance(sc.next());

    }

    public String cancelAccount(Scanner sc) {
        return as.cancelAccount(sc.next());

    }
}
