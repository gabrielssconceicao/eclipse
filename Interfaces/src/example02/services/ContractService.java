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
    contract.getInstallments().add(new Installment(LocalDate.of(2018, 7, 25), 206.04));
    contract.getInstallments().add(new Installment(LocalDate.of(2018, 8, 25), 208.08));
  }
}
