package oop.assigment_problems;

public class DigitalWallet {
    private String walletId;
    private double balance;
    private int pin;

    public DigitalWallet(String walletId, double initialBalance, int pin) {
        this.walletId = walletId;
        this.balance = Math.max(0, initialBalance);
        this.pin = pin;
    }

    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean transfer(double amount, int enteredPin) {
        if (enteredPin != this.pin) {
            System.out.println("Incorrect PIN.");
            return false;
        }
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Transfer successful: Rs " + amount);
            return true;
        }
        System.out.println("Insufficient funds.");
        return false;
    }

    public double getBalance(int enteredPin) {
        if (enteredPin == this.pin) {
            return balance;
        }
        System.out.println("Incorrect PIN.");
        return -1;
    }

    public static void main(String[] args) {
        DigitalWallet wallet = new DigitalWallet("W-889", 5000.0, 1234);
        wallet.addFunds(1000.0);
        wallet.transfer(2500.0, 1234);
        System.out.println("Remaining Balance: Rs " + wallet.getBalance(1234));
    }
}
