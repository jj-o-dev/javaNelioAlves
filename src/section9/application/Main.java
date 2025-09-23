package section9.application;

import section9.entities.BankAccount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BankAccount account;
        System.out.print("Enter account holder name: ");
        String holderName = scan.nextLine();
        System.out.print("Enter account id: ");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.print("Do you want to add initial balance? (Y/n): ");
        String answer = scan.nextLine();

        if (answer.equals("Y")) {
            System.out.print("Enter initial balance: ");
            double initialAmount = scan.nextDouble();
            account = new BankAccount(holderName, id, initialAmount);
        } else {
            account = new BankAccount(holderName, id);
        }

        System.out.println(account);

        System.out.print("Enter an amount to deposit: ");
        double plus = scan.nextDouble();
        account.deposit(plus);
        System.out.println(account);

        System.out.print("Enter an amount for withdraw: ");
        double minus = scan.nextDouble();
        account.withdraw(minus);
        System.out.println(account);

        scan.close();
    }
}
