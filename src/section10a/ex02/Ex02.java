package section10a.ex02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos numeros deseja digitar? ");
        int n = scan.nextInt();
        double[] alpha = new double[n];
        double sum = 0;

        for (int i = 0; i < alpha.length; i++) {
            System.out.print("Digite um numero: ");
            alpha[i] = scan.nextDouble();
        }

        System.out.print("\nVALORES = ");
        for (double num: alpha) {
            System.out.print(num + " ");
            sum += num;
        }

        System.out.println("\nSOMA = " + sum);
        System.out.println("MÉDIA = " + sum / alpha.length);

        scan.close();
    }
}
