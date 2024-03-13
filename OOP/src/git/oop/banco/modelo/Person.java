package git.oop.banco.modelo;

public class Person {
  private String name;
  private String document;

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
}
