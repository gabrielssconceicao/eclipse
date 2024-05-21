package example02.services;

import java.time.LocalDate;

import example02.entities.Contract;
import example02.entities.Installment;

public class ContractService {

  private OnlinePaymentService onlinePaymentService;

  public ContractService(OnlinePaymentService onlinePaymentService) {
    this.onlinePaymentService = onlinePaymentService;
  }

  public void processContract(Contract contract, int months) {
    double basicQuota = contract.getTotalValue() / months;
    for (int i = 1; i <= months; i++) {
      LocalDate dueDate = contract.getDate().plusMonths(i);

      double interest = onlinePaymentService.interest(basicQuota, i);
      double fee = onlinePaymentService.paymentFee(basicQuota + interest);
      double totalQuota = basicQuota + interest + fee;
      contract.getInstallments().add(new Installment(dueDate, totalQuota));
    }
  }
}
