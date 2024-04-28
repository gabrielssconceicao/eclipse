package exercises.ex03.entities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import exercises.ex03.entities.enums.OrderStatus;

public class Order {
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  private List<OrderItem> items = new ArrayList<>();

  private Client client;
  private Date moment;
  private OrderStatus status;

  public Order(Client client, Date date, OrderStatus status) {
    this.client = client;
    this.moment = date;
    this.status = status;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Date getMoment() {
    return moment;
  }

  public void setMoment(Date moment) {
    this.moment = moment;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public List<OrderItem> getItems() {
    return items;
  }

  public void addItem(OrderItem item) {
    items.add(item);
  }

  public void removeItem(OrderItem item) {
    items.remove(item);
  }

  public Double total() {
    double sum = 0.0;
    for (OrderItem item : items) {
      sum += item.subTotal();
    }
    return sum;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Order moment: " + sdf.format(moment) + "\n");
    sb.append("Order status: " + status + "\n");
    sb.append("Client: " + client.getName() + " (" + sdf.format(client.getBirthDate()) + ")"
        + "\n");
    sb.append("Order items:\n");
    for (OrderItem item : items) {
      sb.append(item.toString() + "\n");
      sb.append("\n");
    }
    sb.append("Total price: $" + String.format("%.2f", total()));

    return sb.toString();
  }
}
