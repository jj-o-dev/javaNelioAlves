package section18.ex01.app;

import section18.ex01.entity.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = scan.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> empList = new ArrayList<>();
            String line = br.readLine();
            String[] aux;

            while (line != null) {
                aux = line.split(",");
                empList.add(new Employee(aux[0], aux[1], Double.parseDouble(aux[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double minBound = scan.nextDouble();

            // lista com emails de funcionários com salário > minBound
            List<String> filteredEmails = empList.stream()
                    .filter(e -> e.getSalary() > minBound)
                    .map(Employee::getEmail).sorted()
                    .toList();

            // soma dos salários de funcionários com inicial "M" no nome
            double sum = empList.stream()
                    .filter(e -> e.getName().toUpperCase().startsWith("M"))
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Email of people whose salary is more than " + minBound + ":");
            filteredEmails.forEach(System.out::println);
            System.out.println("Sum of salary of people whose name starts with 'M':");
            System.out.printf("%.2f", sum);

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        scan.close();
    }
}
