package section5.ex07;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float x = scan.nextFloat();
        float y = scan.nextFloat();
        String quadrant;

        if (x > 0 && y > 0) {
            quadrant = "Q1";
        } else if (x < 0 && y > 0) {
            quadrant = "Q2";
        } else if (x < 0 && y < 0) {
            quadrant = "Q3";
        } else if (x > 0 && y < 0) {
            quadrant = "Q4";
        } else if (x != 0 && y == 0 ) {
            quadrant = "Eixo X";
        } else if (x == 0 && y != 0) {
            quadrant = "Eixo Y";
        } else {
            quadrant = "Origem";
        }

        System.out.println(quadrant);

        scan.close();
    }
}
