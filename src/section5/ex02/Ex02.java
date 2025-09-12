package section5.ex02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        if ((x & 1) == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        scan.close();
    }
}
