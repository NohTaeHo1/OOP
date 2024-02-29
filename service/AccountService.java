package service;

import model.AccountDTO;

import java.util.List;

public interface AccountService {
    String createAccount(AccountDTO account);
    String deposit(AccountDTO account);
    String withdraw(AccountDTO account);
    String getBalance(String accountNumber);
    String cancelAccount(String accountNumber);
    List<AccountDTO> getAccounts();

}
