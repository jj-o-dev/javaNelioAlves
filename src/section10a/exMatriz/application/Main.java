package section10a.exMatriz.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        int cols = scan.nextInt();
        int[][] matrix = new int[lines][cols];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int item = scan.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == item) {
                    System.out.println("Position (" + i + "," + j + "): ");
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if (j < cols - 1) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if (i < lines - 1) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                    System.out.println();
                }
            }
        }

        scan.close();
    }
}
