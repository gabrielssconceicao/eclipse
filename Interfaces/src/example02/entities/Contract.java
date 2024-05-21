package example02.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Contract {

  private Integer number;
  private Double totalValue;
  private LocalDate date;

  private List<Installment> installments = new ArrayList<>();

  public Contract(Integer number, Double totalValue, LocalDate date) {
    this.number = number;
    this.totalValue = totalValue;
    this.date = date;
  }

  public Integer getNumber() {
    return number;
  }

  public Double getTotalValue() {
    return totalValue;
  }

  public LocalDate getDate() {
    return date;
  }

  public List<Installment> getInstallments() {
    return installments;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public void setTotalValue(Double totalValue) {
    this.totalValue = totalValue;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

}
