package section10a.ex10.application;

import section10a.ex10.entities.Student;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many students to register: ");
        int n = scan.nextInt();
        scan.nextLine();
        Student[] students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student #" + (i+1));
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("1st grade: ");
            double grade1 = scan.nextDouble();
            System.out.print("2nd grade: ");
            double grade2 = scan.nextDouble();

            students[i] = new Student(name, grade1, grade2);
            scan.nextLine();
        }

        System.out.println("Approved students:");
        for (Student s:students) {
            if (((s.getGrade1() + s.getGrade2())/2) >= 6.0) {
                System.out.println(s.getName());
            }
        }

        scan.close();
    }
}
