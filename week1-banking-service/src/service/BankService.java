package service;

import model.Account;
import exception.AccountNotFoundException;
import exception.InsufficientBalanceException;
import exception.InvalidAmountException;

import java.util.HashMap;
import java.util.Map;

public class BankService {

    private Map<String, Account> accounts = new HashMap<>();

    public void createAccount(String accountNumber, String holderName, double initialBalance) {
        Account account = new Account(accountNumber, holderName, initialBalance);
        accounts.put(accountNumber, account);
    }

    public Account getAccount(String accountNumber) {
        Account account = accounts.get(accountNumber);

        if (account == null) {
            throw new AccountNotFoundException("Account not found: " + accountNumber);
        }

        return account;
    }

    public void deposit(String accountNumber, double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive");
        }

        Account account = getAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(String accountNumber, double amount) {

        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive");
        }

        Account account = getAccount(accountNumber);

        if (account.getBalance() < amount) {
            throw new InsufficientBalanceException("Insufficient balance");
        }

        account.withdraw(amount);
    }
}
