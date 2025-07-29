package practice_2;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String newOwner) {
        owner = newOwner;
    }

    public void deposit(double amount) {
        this.balance = balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = balance - amount;
    }

    public void printBalance() {
        System.out.println("Current balance: " + balance);
    }
}
