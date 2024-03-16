package git.oop.banco.modelo;

import java.time.LocalDateTime;

public class Person {
  private String name;
  private String document;
  private double rendimentoAnual;
  private TipoPessoa tipo = TipoPessoa.FISICA;

  // LocalDateTime = Data e Hora sem fuso horário
  private LocalDateTime dataUltimaAtualizacao = LocalDateTime.now();

  public Person(String name, String document) {
    this.name = name;
    this.document = document;
  }

  public String getName() {
    return name;
  }

  public String getDocument() {
    return document;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public double getRendimentoAnual() {
    return rendimentoAnual;
  }

  public void setRendimentoAnual(double rendimentoAnual) {
    this.rendimentoAnual = rendimentoAnual;
  }

  public TipoPessoa getTipo() {
    return tipo;
  }

  public void setTipo(TipoPessoa tipo) {
    this.tipo = tipo;
  }

  public LocalDateTime getDataUltimaAtualizacao() {
    return dataUltimaAtualizacao;
  }

  public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
    this.dataUltimaAtualizacao = dataUltimaAtualizacao;
  }
}
