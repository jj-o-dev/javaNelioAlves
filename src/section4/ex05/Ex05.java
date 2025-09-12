package section4.ex05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p1, quantia1, p2, quantia2;
        float valor1, valor2, total;

        p1 = scan.nextInt();
        quantia1 = scan.nextInt();
        valor1 = scan.nextFloat();

        p2 = scan.nextInt();
        quantia2 = scan.nextInt();
        valor2 = scan.nextFloat();

        total = quantia1 * valor1 + quantia2 * valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        scan.close();
    }
}
