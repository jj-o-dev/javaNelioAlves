package section06b.ex01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        for (int i = 1; i <= x; i++) {
            if ((i & 1) == 1) {
                System.out.print(i + " ");
            }
        }

        scan.close();
    }
}
