package section8a.ex03.application;

import section8a.ex03.entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double grade1 = scan.nextDouble();
        double grade2 = scan.nextDouble();
        double grade3 = scan.nextDouble();

        Student student1 = new Student(name, grade1, grade2, grade3);

        System.out.println(student1);

        scan.close();
    }
}
