package section16.app;

import section16.model.Contract;
import section16.service.ContractService;
import section16.service.PayPalService;

import java.time.LocalDate;
import java.util.Scanner;

import static section16.model.Installment.format;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Contract contrato = generateContract(scan);

        System.out.print("Entre com o número de parcelas: ");
        int parcelas = scan.nextInt();

        ContractService service = new ContractService(new PayPalService());
        service.processContract(contrato, parcelas);

        System.out.println("\nParcelas ###############");
        contrato.showInstallments();

        scan.close();
    }

    private static Contract generateContract(Scanner scan) {
        System.out.println("Entre com os dados do contrato:");
        System.out.print("Numero: ");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.print("Data (dd/mm/yyyy): ");
        LocalDate data = LocalDate.parse(scan.nextLine(), format);
        System.out.print("Valor total: ");
        double value = scan.nextDouble();

        return new Contract(num, data, value);
    }
}
