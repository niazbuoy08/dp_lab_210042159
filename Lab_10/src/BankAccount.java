import java.util.List;
import java.util.ArrayList;

public class BankAccount {
    private String accountId;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(String accountId, double initialDeposit) {
        this.accountId = accountId;
        this.balance = initialDeposit;
        this.transactionHistory = new ArrayList<>();
        this.transactionHistory.add("Account created with initial deposit: " + initialDeposit);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public String getAccountId() {
        return accountId;
    }
}
