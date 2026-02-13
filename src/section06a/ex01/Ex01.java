package section06a.ex01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int senha = scan.nextInt();

        while (senha != 2002) {
            System.out.println("Senha invalida");
            senha = scan.nextInt();
        }

        System.out.println("Acesso permitido");

        scan.close();
    }
}
