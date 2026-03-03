package section15.app;

import section15.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "/home/jprr/Projects/javaNelioAlves/src/section15/items.csv";
        String newDir = "/home/jprr/Projects/javaNelioAlves/src/section15/out/";
        String newFile = "/home/jprr/Projects/javaNelioAlves/src/section15/out/summary.csv";

        List<Product> productList = readFile(path);

        if (createSummary(productList, newDir, newFile)) {
            System.out.println("Summary file created!");
        } else {
            System.out.println("Error while creating file");
        }
    }

    private static List<Product> readFile(String path) {
        List<Product> productList = new ArrayList<>();
        String[] infos;

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null) {
                infos = line.split(",");
                productList.add(new Product(infos[0],
                        Double.valueOf(infos[1]), Integer.valueOf(infos[2])));
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return productList;
    }

    private static boolean createSummary(List<Product> list, String dirPath, String newFilePath) {
        String name, total;
        File dir = new File(dirPath);

        if (!dir.exists()) {
            dir.mkdir();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFilePath))){
            for (Product prod: list) {
                name = prod.getName();
                total = String.valueOf(prod.totalValue());
                bw.write(name + "," + total);
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
