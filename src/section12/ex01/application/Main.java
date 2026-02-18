package section12.ex01.application;

import section12.ex01.entities.Client;
import section12.ex01.entities.Order;
import section12.ex01.entities.OrderItem;
import section12.ex01.entities.Product;
import section12.ex01.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER CLIENT DATA:");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Birth date (dd/mm/yyyy): ");
        LocalDate birth = LocalDate.parse(scan.nextLine(), Client.form1);

        System.out.println("ENTER ORDER DATA:");
        System.out.print("Order status: ");
        String status = scan.nextLine();
        System.out.print("How many items to this order: ");
        int itemsNum = scan.nextInt();
        scan.nextLine();

        Order order = new Order(new Client(name, email, birth), LocalDateTime.now(), OrderStatus.valueOf(status));

        for (int i = 1; i <= itemsNum; i++) {
            System.out.println("ENTER #" + i + " ITEM DATA:");
            System.out.print("Product name: ");
            String prodName = scan.nextLine();
            System.out.print("Product price: ");
            double prodPrice = scan.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scan.nextInt();
            scan.nextLine();

            order.addItem(new OrderItem(quantity, new Product(prodName, prodPrice)));
        }

        System.out.println("\nORDER SUMMARY:");
        System.out.println(order);

        scan.close();
    }
}
