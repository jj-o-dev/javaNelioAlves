package section17.ex02.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> votes = new HashMap<>();

        System.out.print("Enter file path: ");
        String path = scan.nextLine();

        try(BufferedReader br = new BufferedReader( new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] info = line.split(",");
                if (votes.containsKey(info[0])) {
                    votes.put(info[0], votes.get(info[0]) + Integer.parseInt(info[1]));
                } else {
                    votes.put(info[0], Integer.parseInt(info[1]));
                }
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (String k: votes.keySet()) {
            System.out.println(k + ": " + votes.get(k));
        }

        scan.close();
    }
}
