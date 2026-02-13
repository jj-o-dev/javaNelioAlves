package section06a.ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int c1 = 0, c2 = 0, c3 = 0;
        int option;

        do {
            option = scan.nextInt();
            switch (option) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
            }
        } while (option != 4);

        System.out.println("\nMUITO OBRIGADO");
        System.out.println("Alcool: " + c1);
        System.out.println("Gasolina: " + c2);
        System.out.println("Diesel: " + c3);

        scan.close();
    }
}
