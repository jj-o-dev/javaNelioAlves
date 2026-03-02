package anotacoes.java_files;

import java.io.File;
import java.util.Scanner;

public class JavaIO4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter folder path: ");
        String path = scan.nextLine();

        File file = new File(path);
        File[] folders = file.listFiles(f -> f.isDirectory() && !f.isHidden());

        if (folders != null) {
            for (File folder: folders) {
                System.out.println(folder);
            }
        }

        scan.close();
    }
}
