package section06b.ex05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int fat = 1;

        for (int i = n; i > 0; i--) {
            fat *= i;
        }

        System.out.println(fat);

        scan.close();
    }
}
