package exercises.ex03.entities;

public class OrderItem {

  private Integer quantity;
  private Product product;

  public OrderItem(Integer quantity, Product product) {
    this.quantity = quantity;
    this.product = product;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Double subTotal() {
    return quantity * product.getPrice();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("\t Product: " + product.getName() + "\n");
    sb.append("\t Quantity: " + quantity + "\n");
    sb.append("\t Subtotal: R$" + String.format("%.2f", subTotal()) + "\n");

    return sb.toString();
  }
}
