package section06b.ex07;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d %d %d%n", i, i*i, i*i*i);
        }

        scan.close();
    }
}
