package HW12.prob2;
public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount < 0)
            throw new IllegalArgumentException("Amount must be positive");
        else if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount < 0)
            throw new IllegalArgumentException("Amount must be positive");
        else if (amount > balance)
            throw new AccountException("Insufficient funds! Withdrawal amount exceeds balance.");
        else if (balance - amount < 100)
            throw new AccountException("Low balance warning! Balance cannot go below $100.");
        else if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
