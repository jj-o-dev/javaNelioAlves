package section16.service;

import section16.model.Contract;
import section16.model.Installment;

public class ContractService {
    OnlinePaymentService pService;

    public ContractService(OnlinePaymentService paymentService) {
        this.pService = paymentService;
    }

    public void processContract(Contract contract, Integer months) {
        Double value = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            contract.addInstallment(
                    new Installment(contract.getDate().plusMonths(i),
                            pService.paymentFee(value + pService.interest(value, i))));
        }
    }
}
