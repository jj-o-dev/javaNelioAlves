package section10a.ex04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos numeros deseja adicionar? ");
        int n = scan.nextInt();
        int[] numList = new int[n];
        int count = 0;

        for (int i = 0; i < numList.length; i++) {
            System.out.print("Adicione um numero: ");
            int x = scan.nextInt();

            numList[i] = x;
        }

        System.out.println("\nNUMEROS PARES:");
        for (int num: numList) {
            if ((num & 1) == 0) {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println("\n\nQUANTIDADE DE PARES = " + count);
        scan.close();
    }
}
