package section5.ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int maior = A;
        int menor = B;

        if (A < B) {
            maior = B;
            menor = A;
        }

        if (maior % menor == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao Sao Multiplos");
        }

        scan.close();
    }
}
