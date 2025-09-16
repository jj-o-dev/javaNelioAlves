package section6b.ex04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int num1, num2;

        for (int i = 0; i < n; i++) {
            num1 = scan.nextInt();
            num2 = scan.nextInt();

            if (num2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println((float) num1 / num2);
            }
        }

        scan.close();
    }
}
