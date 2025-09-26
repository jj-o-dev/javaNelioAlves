package section10a.ex08;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many values to insert: ");
        int n = scan.nextInt();
        int[] beta = new int[n];
        int count = 0;
        double avg = 0;

        for (int i = 0; i < beta.length; i++) {
            System.out.print("Enter a number: ");
            beta[i] = scan.nextInt();
            if ((beta[i] & 1) == 0) {
                count++;
                avg += beta[i];
            }
        }

        if (count > 0) {
            System.out.printf("Average: %.2f%n", avg/ count);
        } else {
            System.out.println("NONE EVEN NUMBER");
        }

        scan.close();
    }
}
