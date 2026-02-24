package section13.ex02.app;

import section13.ex02.entity.Pessoa;
import section13.ex02.entity.PessoaFisica;
import section13.ex02.entity.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Pessoa> pessoas = appMenu();
        double total = 0.0;

        System.out.println("\nTAXES PAID:");
        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa);
            total += pessoa.taxa();
        }
        System.out.printf("%nTOTAL TAXES: %.2f", total);
    }

    private static List<Pessoa> appMenu() {
        List<Pessoa> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            scan.nextLine();
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            String type = scan.nextLine().substring(0, 1).toLowerCase();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Anual income: ");
            double income = scan.nextDouble();

            if (type.equals("i")) {
                System.out.print("Health expenditures: ");
                double healthExpend = scan.nextDouble();
                list.add(new PessoaFisica(name, income, healthExpend));
            } else {
                System.out.print("Number of employees: ");
                int employees = scan.nextInt();
                list.add(new PessoaJuridica(name, income, employees));
            }
        }

        scan.close();
        return list;
    }
}
