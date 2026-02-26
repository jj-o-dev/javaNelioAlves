package section14.ex01.app;

import section14.ex01.model.entity.Account;
import section14.ex01.model.exceptions.ExceedsLimitException;
import section14.ex01.model.exceptions.InsufficientBalanceException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter new account data ##################");
            System.out.print("Number: ");
            int num = scan.nextInt();
            scan.nextLine();
            System.out.print("Holder: ");
            String holder = scan.nextLine();
            System.out.print("Initial balance: ");
            double balance = scan.nextDouble();
            System.out.print("Initial withdraw limit: ");
            double limit = scan.nextDouble();

            Account account = new Account(num, holder, balance, limit);

            System.out.print("\nEnter amount for withdraw: ");
            double amount = scan.nextDouble();
            account.withdraw(amount);
            System.out.println("\nWithdraw approved");
            System.out.printf("New balance: $%.2f", account.getBalance());
        }
        catch (InputMismatchException e) {
            System.out.println("Input error: enter only valid data");
        }
        catch (ExceedsLimitException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        scan.close();
    }
}
