// 
// Bank Account has a balance and allows to withdrawing and depositing, also displaying balance.
// Author: Daniel Flesch
// 01/31/2024

public class BankAccount {
    
    private double balance;


    // No-arguement constructor that makes a bank account
    public BankAccount()
    {
        balance = 0.0;

    }

    // Arguement constructor that makes a bank account with initial amount.
    public BankAccount(double initialAmount)
    {
        balance = initialAmount;

    }

    // Deposits money to the balance.
    public void deposit(double amount)
    {
        balance = balance + amount;

    }

    // Withdraws money out of the balance.
    public void withdraw(double amount)
    {
        balance = balance - amount;

    }

    // Displays the balance.
    public double getBalance()
    {
        return balance;

    }
    
}
