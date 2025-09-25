package section10a.ex01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scan.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite qualquer número: ");
            vect[i] = scan.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for (int num: vect) {
            if (num < 0) {
                System.out.println(num);
            }
        }

        scan.close();
    }
}
