package section14.ex01.model.entity;

import section14.ex01.model.exceptions.ExceedsLimitException;
import section14.ex01.model.exceptions.InsufficientBalanceException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account() {
    }

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdraw failed: Insufficient balance");
        }
        if (amount > withdrawLimit) {
            throw new ExceedsLimitException("Withdraw failed: Exceeded withdraw limit");
        }

        balance -= amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account number: ").append(getNumber()).append("\n");
        sb.append("Holder name: ").append(getHolder()).append("\n");
        sb.append("Balance: ").append(getBalance()).append("\n");
        sb.append("Limit: ").append(getWithdrawLimit()).append("\n");
        return sb.toString();
    }
}
