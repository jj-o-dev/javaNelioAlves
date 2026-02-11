package section10a.exMatriz;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        while (x != y) {
            if (x < y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }

            x = scan.nextInt();
            y = scan.nextInt();
        }

        scan.close();
    }
}
