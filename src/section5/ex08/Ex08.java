package section5.ex08;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salary = scan.nextDouble();
        double amount = 0;
        boolean isExempt = false;

        if (salary <= 2000) {
            isExempt = true;
        } else if (salary > 2000 && salary <= 3000) {
            salary -= 2000;
            amount = salary * 0.08;
        } else if (salary > 3000 && salary <= 4500) {
            salary -= 2000;
            amount = (salary - 1000) * 0.18 + 80;
        } else if (salary > 4500) {
            salary -= 2000;
            amount = (salary - 2500) * 0.28 + 350;
        }

        if (isExempt) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$%.2f%n", amount);
        }

        scan.close();
    }
}
