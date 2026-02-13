package section04.ex04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your employee ID: ");
        int id = scan.nextInt();
        System.out.print("Insert your total worked hours: ");
        int hours = scan.nextInt();
        System.out.print("Insert your payment per hour: ");
        float payment = scan.nextFloat();
        float salary = payment * hours;

        System.out.printf("%nNUMBER: %d%nSALARY: U$%.2f%n", id, salary);

        scan.close();
    }
}
