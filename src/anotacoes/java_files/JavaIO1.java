package anotacoes.java_files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JavaIO1 {
    public static void main(String[] args) {
        File file = new File("/home/jprr/temp/test.txt");
        Scanner scan = null;

        try {
            scan = new Scanner(file);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (scan != null) {
                scan.close();
            }
        }
    }
}
