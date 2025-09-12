package section5.ex05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int id = scan.nextInt();
        int amount = scan.nextInt();
        float value = 0f;

        switch(id) {
            case 1:
                value = 4.0f;
                break;
            case 2:
                value = 4.50f;
                break;
            case 3:
                value = 5.0f;
                break;
            case 4:
                value = 2.0f;
                break;
            case 5:
                value = 1.5f;
                break;
            default:
                System.out.println("Código inválido!");
        }

        System.out.printf("TOTAL: R$ %.2f%n", amount * value);

        scan.close();
    }
}
