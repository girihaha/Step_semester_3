package oop.class_problems;

public class BankCustomer {
    String accountNumber;
    String accountHolder;
    double balance;

    public BankCustomer(String accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("ACC901", "Girish", 5000.0);
        customer.deposit(1500.0);
        customer.withdraw(2000.0);
        customer.withdraw(6000.0);
    }
}
