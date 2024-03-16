package git.oop.banco.modelo;

public class Person {
  private String name;
  private String document;
  private Double rendimentoAnual;
  private TipoPessoa tipo = TipoPessoa.FISICA;

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

  public Double getRendimentoAnual() {
    return rendimentoAnual;
  }

  public void setRendimentoAnual(Double rendimentoAnual) {
    this.rendimentoAnual = rendimentoAnual;
  }

  public TipoPessoa getTipo() {
    return tipo;
  }

  public void setTipo(TipoPessoa tipo) {
    this.tipo = tipo;
  }
}
