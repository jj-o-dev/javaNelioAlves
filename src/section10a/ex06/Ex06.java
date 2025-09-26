package section10a.ex06;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many values each array will have? ");
        int n = scan.nextInt();
        int [] alpha = new int[n];
        int [] omega = new int[n];

        for (int i = 0; i < 2; i++) {
            String msg = (i == 0) ? "first" : "second";
            System.out.println("Enter values of the " + msg + " array:");
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    alpha[j] = scan.nextInt();
                } else {
                    omega[j] = scan.nextInt();
                }
            }
        }

        /* Me sinto meio solitário às vezes
        */

        System.out.println("\nSum of values:");
        for (int k = 0; k < n; k++) {
            System.out.println(alpha[k] + omega[k]);
        }

        scan.close();
    }
}
