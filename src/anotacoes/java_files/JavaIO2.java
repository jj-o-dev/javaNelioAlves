package anotacoes.java_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaIO2 {
    public static void main(String[] args) {
        String path = "/home/jprr/temp/test.txt";

        try (BufferedReader bReader = new BufferedReader(new FileReader(path))) {
            String line = bReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bReader.readLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
