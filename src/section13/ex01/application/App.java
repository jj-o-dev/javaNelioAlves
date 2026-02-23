package section13.ex01.application;

import section13.ex01.entities.ImportedProduct;
import section13.ex01.entities.Product;
import section13.ex01.entities.UsedProduct;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Product> products = appMenu();

        System.out.println("PRICE TAGS:");
        for (Product prod: products) {
            System.out.println(prod.priceTag());
        }
    }

    private static ArrayList<Product> appMenu() {
        ArrayList<Product> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();

        scan.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Commom, used or imported (c, u, i)? ");
            String type = scan.nextLine().substring(0, 1).toLowerCase();
            System.out.print("Name: ");
            String prodName = scan.nextLine();
            System.out.print("Price: ");
            double prodPrice = scan.nextDouble();

            if (type.equals("i")) {
                System.out.print("Custom fee: ");
                double customFee = scan.nextDouble();
                list.add(new ImportedProduct(prodName, prodPrice, customFee));
            } else if (type.equals("u")) {
                scan.nextLine();
                System.out.print("Manufacture date (dd/mm/yyyy): ");
                String date = scan.nextLine();
                list.add(new UsedProduct(prodName, prodPrice, LocalDate.parse(date, UsedProduct.format)));
            } else {
                list.add(new Product(prodName, prodPrice));
            }
        }
        scan.close();
        return list;
    }
}
