package section10a.ex07;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many values to insert: ");
        int n = scan.nextInt();
        double[] zetta = new double[n];
        double avg = 0;

        for (int i = 0; i < zetta.length; i++) {
            System.out.print("Enter a number: ");
            zetta[i] = scan.nextDouble();
            avg += zetta[i];
        }

        avg = avg / zetta.length;
        System.out.printf("%nAverage: %.3f%n", avg);
        System.out.println("Values above the average:");
        for (double val: zetta) {
            if (val < avg) {
                System.out.printf("%.1f%n", val);
            }
        }

        scan.close();
    }
}
