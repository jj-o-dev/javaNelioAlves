package section17.ex01.app;

import section17.ex01.model.entity.Courses;
import section17.ex01.model.entity.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Student> students = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("How many students for course " + Courses.values()[i] + "? ");
            int n = scan.nextInt();

            for (int j = 0; j < n; j++) {
                students.add(new Student(scan.nextInt()));
            }
        }
        System.out.print("Total students: " + students.size());
        scan.close();
    }
}
