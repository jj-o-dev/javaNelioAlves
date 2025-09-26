package section10a.ex05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Dá pra fazer o exercício sem nem usar um array kjkjkj,
        // Basta mostrar qual dos valores digitados foi o maior e a posição igual i
        // Vou deixar assim msm fds
        System.out.print("How many numbers you want to insert: ");
        int n = scan.nextInt();
        double greater = 0;
        int posi = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Insert a number: ");
            double x = scan.nextDouble();

            if (x > greater) {
                greater = x;
                posi = i;
            }
        }

        System.out.printf("%nGreatest value: %.2f%n", greater);
        System.out.printf("It's position: %d%n", posi);

        scan.close();
    }
}
