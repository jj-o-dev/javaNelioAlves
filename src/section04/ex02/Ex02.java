package section04.ex02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double raio, area, PI = 3.14159;

        raio = scan.nextDouble();
        area = PI * (raio * raio);

        System.out.printf("A=%.4f%n", area);

        scan.close();
    }
}