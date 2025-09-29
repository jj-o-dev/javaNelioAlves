package section10a.exPensionato.application;

import section10a.exPensionato.entities.Registry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int n = scan.nextInt();
        scan.nextLine();

        Registry[] registries = new Registry[10];
        String name, email;
        int room;
        boolean invalidRoom;

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            name = scan.nextLine();
            System.out.print("E-mail: ");
            email = scan.nextLine();
            do {
                System.out.print("Room: ");
                room = scan.nextInt();

                if (registries[room] == null) {
                    System.out.println("Room available");
                    invalidRoom = false;
                } else {
                    System.out.println("This room has already taken, choose another");
                    invalidRoom = true;
                }

            } while (invalidRoom);
            registries[room] = new Registry(name, email);
            scan.nextLine();
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < registries.length; i++) {
            if (registries[i] != null) {
                System.out.println(i + ": " + registries[i].getName() + ", " + registries[i].getEmail());
            }
        }

        scan.close();
    }
}
