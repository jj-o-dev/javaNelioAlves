package section08a.ex01.application;

import section08a.ex01.entities.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter rectangle width and height: ");
        double w = scan.nextDouble();
        double h = scan.nextDouble();

        Rectangle ret1 = new Rectangle(w, h);

        System.out.println("A = " + ret1.area());
        System.out.println("P = " + ret1.perimeter());
        System.out.println("D = " + ret1.diagonal());

        scan.close();
    }
}
