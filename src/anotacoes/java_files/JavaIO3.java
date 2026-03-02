package anotacoes.java_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JavaIO3 {
    public static void main(String[] args) {
        String[] lines = new String[] {"nova linha 1", "nova linha 2"};
        String path = "/home/jprr/temp/test2.txt";

        try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(path))) {
            for (String line: lines) {
                bWriter.write(line);
                bWriter.newLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
