package section08a.ex02.application;

import section08a.ex02.entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Gross salary: ");
        double salary = scan.nextDouble();
        System.out.print("Tax to pay: ");
        double tax = scan.nextDouble();

        Employee emp1 = new Employee(name, salary, tax);

        System.out.println(emp1);
        System.out.print("Which percentage to increase salary? ");
        double percent = scan.nextDouble();
        emp1.increaseSalary(percent);

        System.out.println(emp1);

        scan.close();
    }
}
