package oop.class_problems;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private double dailyWithdrawalLimit;
    private double withdrawnToday;

    public BankAccount(String accountNumber, double balance, double dailyWithdrawalLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
        this.withdrawnToday = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | Balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            return;
        }
        if (withdrawnToday + amount > dailyWithdrawalLimit) {
            System.out.println("Daily withdrawal limit exceeded.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        withdrawnToday += amount;
        System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-441", 10000.0, 5000.0);
        acc.deposit(2000.0);
        acc.withdraw(3000.0);
        acc.withdraw(3000.0);
    }
}
