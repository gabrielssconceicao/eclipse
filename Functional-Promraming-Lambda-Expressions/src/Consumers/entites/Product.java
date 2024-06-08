package Consumers.entites;

public class Product {

  private String name;
  private Double price;

  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public static void staticPriceUpdate(Product p) {
    p.setPrice(p.getPrice() * 1.5);
  }

  public void nonStaticPriceUpdate() {
    price = price * 1.5;
  }

  @Override
  public String toString() {
    return "Product [name=" + name + ", price=" + price + "]";
  }

}
