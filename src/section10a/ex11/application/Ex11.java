package section10a.ex11.application;

import section10a.ex11.entities.Volunteer;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many volunteers: ");
        int n = scan.nextInt();
        scan.nextLine();
        Volunteer[] volunteers = new Volunteer[n];
        double minHeight = 0, maxHeight = 0, femaleAvg = 0, maleTotal = 0, femaleTotal = 0;

        for (int i = 0; i < volunteers.length; i++) {
            System.out.println("Volunteer #" + (i+1));
            System.out.print("Gender (M/F): ");
            String gender = scan.nextLine();
            System.out.print("Height: ");
            double height = scan.nextDouble();

            volunteers[i] = new Volunteer(height, gender.toUpperCase());

            scan.nextLine();
        }

        minHeight = volunteers[0].getHeight();
        for (Volunteer v: volunteers) {
            if (v.getHeight() > maxHeight) {
                maxHeight = v.getHeight();
            }
            if (v.getHeight() < minHeight) {
                minHeight = v.getHeight();
            }
            if (v.getGender().equals("F")) {
                femaleTotal++;
                femaleAvg += v.getHeight();
            }
            if (v.getGender().equals("M")) {
                maleTotal++;
            }
        }

        System.out.printf("Lowest height: %.2f%n", minHeight);
        System.out.printf("Greatest height: %.2f%n", maxHeight);
        System.out.printf("Females average height: %.2f%n", femaleAvg/femaleTotal);
        System.out.println("Male's total: " + maleTotal);

        scan.close();
    }
}
