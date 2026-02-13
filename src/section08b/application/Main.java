package section08b.application;

import section08b.utils.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the dollar price today? ");
        double dollarPrice = scan.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarAmount = scan.nextDouble();

        double realPrice = CurrencyConverter.dolarToReal(dollarAmount, dollarPrice);

        System.out.printf("%nAmount to be paid in reais: R$%.2f%n", realPrice);

        scan.close();
    }
}
