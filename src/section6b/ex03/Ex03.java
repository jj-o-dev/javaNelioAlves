package section6b.ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        float nota1, nota2, nota3;
        float[] media = new float[3];

        for (int i = 0; i < n; i++) {
            nota1 = scan.nextFloat();
            nota2 = scan.nextFloat();
            nota3 = scan.nextFloat();

            media[i] = (nota1*2 + nota2*3 + nota3*5) / 10;
        }

        for (float m: media) {
            System.out.printf("%.1f%n", m);
        }

        scan.close();
    }
}
