package section5.ex04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inicio = scan.nextInt();
        int fim = scan.nextInt();
        int tempo = 0;

        if (inicio < fim) {
            tempo = inicio - fim;
        } else {
            tempo = (24 - inicio) + fim;
        }

        System.out.println("O JOGO DUROU " + Math.abs(tempo) + " HORA(S)");

        scan.close();
    }
}
