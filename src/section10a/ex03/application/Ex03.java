package section10a.ex03.application;

import section10a.ex03.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja cadastrar? ");
        int n = scan.nextInt();
        scan.nextLine();

        Person[] people = new Person[n];
        List<String> usdimeno = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < people.length; i++) {
            System.out.println((i+1) + "ª pessoa:");
            System.out.print("Nome: ");
            String name = scan.nextLine();
            System.out.print("Idade: ");
            int age = scan.nextInt();
            System.out.print("Altura: ");
            double height = scan.nextDouble();

            people[i] = new Person(name, age, height);
            scan.nextLine();
        }

        double heightAvg = 0;
        for (Person p: people) {
            heightAvg += p.getHeight();

            if (p.getAge() < 16) {
                usdimeno.add(p.getName());
                count++;
            }
        }

        heightAvg = heightAvg / people.length;

        System.out.printf("%nAltura média: %.2f%n", heightAvg);
        System.out.println("Pessoas com menos de 16 anos: " + (double) count / n * 100 + "%");
        for (String name: usdimeno) {
            System.out.println(name);
        }

        scan.close();
    }
}
