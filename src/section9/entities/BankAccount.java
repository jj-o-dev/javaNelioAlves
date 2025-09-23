package section9.entities;

public class BankAccount {

    private String name;
    private final int accountID;
    private double balance;

    public BankAccount(String name, int accountID) {
        this.name = name;
        this.accountID = accountID;
    }

    public BankAccount(String name, int accountID, double balance) {
        this.name = name;
        this.accountID = accountID;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount - 5);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n##### Current account data #####\n")
                .append("Name: " ).append(getName()).append("\n")
                .append("ID: ").append(getAccountID()).append("\n")
                .append("Balance: ").append(getBalance()).append("\n");
        return sb.toString();
    }
}
