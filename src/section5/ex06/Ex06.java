package section5.ex06;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float z = scan.nextFloat();
        String msg;

        if (z >= 0 && z <= 25) {
            msg = "Intervalo [0,25]";
        } else if (z > 25 && z <= 50) {
            msg = "Intervalo (25, 50]";
        } else if (z > 50 && z <= 75) {
            msg = "Intervalo (50, 75]";
        } else if (z > 75 && z <= 100) {
            msg = "Intervalo (75, 100]";
        } else {
            msg = "Fora de intervalo";
        }

        System.out.println(msg);

        scan.close();
    }
}
