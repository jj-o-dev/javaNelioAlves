package section10a.ex09.application;

import section10a.ex09.entities.Person;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many people to registrate: ");
        int n = scan.nextInt();
        scan.nextLine();
        Person[] people = new Person[n];
        int maxAge = 0;
        String olderName = "";

        for (int i = 0; i < people.length; i++) {
            System.out.println("Person data #" + (i+1));
            System.out.print("Enter name: ");
            String name = scan.nextLine();
            System.out.print("Enter age: ");
            int age = scan.nextInt();

            people[i] = new Person(name, age);
            scan.nextLine();
        }

        for (Person person: people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
                olderName = person.getName();
            }
        }

        System.out.println("\nOldest person: " + olderName);

        scan.close();
    }
}
