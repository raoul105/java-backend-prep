package app;

import service.BankService;
import exception.AccountNotFoundException;
import exception.InsufficientBalanceException;
import exception.InvalidAmountException;

public class BankingApplication {

    public static void main(String[] args) {

        BankService bankService = new BankService();

        try {
            bankService.createAccount("123", "Rahul", 5000);

            bankService.deposit("123", 1000);
            bankService.withdraw("123", 7000);  // This will cause exception

            System.out.println("Transaction completed successfully");

        } catch (InvalidAmountException e) {
            System.out.println("Invalid amount: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (AccountNotFoundException e) {
            System.out.println("Account error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}