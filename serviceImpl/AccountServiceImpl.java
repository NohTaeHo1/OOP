package serviceImpl;

import builder.AccountBuilder;
import model.AccountDTO;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    private static AccountService instance = new AccountServiceImpl();
    List<AccountDTO> accounts = new ArrayList<>();

    private AccountServiceImpl() {
        this.accounts = new ArrayList<>();
    }
    public static AccountService getInstance() {
        return instance;
    }


    @Override
    public String createAccount(AccountDTO build) {
       /* accounts.add(new AccountBuilder()
                .id()
                .accoutNumber()
                .accoutHolder()
                .balance()
                .transactionDate()
        );*/
        return "";
    }

    @Override
    public String deposit(AccountDTO account) {
        return null;
    }

    @Override
    public String withdraw(AccountDTO account) {
        return null;
    }

    @Override
    public String getBalance(String accountNumber) {
        return null;
    }

    @Override
    public List<AccountDTO> getAccounts() {
        return null;
    }

    @Override
    public String cancelAccount(String accountNumber) {
        return null;

    }
}
