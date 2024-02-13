// Tests the bank account code
// Author: Daniel Flesch
// 01/31/2024

public class BankAccountTester {
    public static void main(String[] args)
    {
        BankAccount account1 = new BankAccount();

        account1.deposit(10000);
        account1.withdraw(600);
        account1.withdraw(400);
        System.out.println("\nAccount1's balance is $" + account1.getBalance());
        System.out.println("Expected $9000");

        // BankAccount account2 = new BankAccount();

        // account2.deposit(6000);
        // account2.withdraw(1000);
        // System.out.println("\nAccount2's balance is $" + account2.getBalance());
        // System.out.println("Expected $5000");
   
        // BankAccount account3 = new BankAccount(2500);

        // account3.withdraw(500);
        // System.out.println("\nAccount3's balance is $" + account3.getBalance());
        // System.out.println("Expected $2000\n");
    }
}
